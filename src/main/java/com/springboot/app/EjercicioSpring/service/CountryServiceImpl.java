package com.springboot.app.EjercicioSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.EjercicioSpring.exception.ResourceNotFoundException;
import com.springboot.app.EjercicioSpring.model.Country;
import com.springboot.app.EjercicioSpring.repository.CountrysRepository;

@Service //Indica que es un servicio
@Transactional
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountrysRepository countryRepository;

	@Override
	public Country getCountrysById(int countryId) {
		Optional<Country> countryDb = this.countryRepository.findById(countryId);
		if (countryDb.isPresent()) {
			return countryDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + countryId);
		}
	}

	@Override
	public List<Country> getAllCountrys() {
		return this.countryRepository.findAll();
	}

	@Override
	public void deleteCountrys(int countryId) {
		Optional<Country> countryDb = this.countryRepository.findById(countryId);
		if(countryDb.isPresent()) {
			this.countryRepository.delete(countryDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + countryId);
		}
		
	}

	@Override
	public Country updateCountrys(Country country) {
		Optional<Country> countryDb = this.countryRepository.findById( country.getId());
		if (countryDb.isPresent()) {
			Country countryUpdate = countryDb.get();
			countryUpdate.setId(country.getId());
			countryUpdate.setId_airport(country.getId_airport());
			countryUpdate.setCode(country.getCode());
			countryUpdate.setName(country.getName());
			countryRepository.save(countryUpdate);
			return countryUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + country.getId());
		}
	}

	@Override
	public Country createCountry(Country country) {
		return countryRepository.save(country);
	}

}
