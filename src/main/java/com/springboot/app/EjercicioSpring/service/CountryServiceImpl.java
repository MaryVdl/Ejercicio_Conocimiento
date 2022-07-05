package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.EjercicioSpring.model.Countrys;
import com.springboot.app.EjercicioSpring.repository.CountrysRepository;

@Service //Indica que es un servicio
@Transactional
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountrysRepository countryRepository;

	@Override
	public Countrys getCountrysById(long countryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Countrys> getAllCountrys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCountrys(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Countrys updateCountrys(Countrys country) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
