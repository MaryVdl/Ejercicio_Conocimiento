package com.springboot.app.EjercicioSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.EjercicioSpring.exception.ResourceNotFoundException;
import com.springboot.app.EjercicioSpring.model.Airports;
import com.springboot.app.EjercicioSpring.repository.AirportsRepository;


@Service
@Transactional
public class AirportsServiceImpl implements AirportsService{
	
	//Inyectar Dependencia (Crear instancia cuando sea necesario)
	@Autowired
	private AirportsRepository airportsRepository;

	@Override
	public Airports getAirportsById(int airportId) {
		Optional<Airports> airportDb = this.airportsRepository.findById(airportId);
		
		if (airportDb.isPresent()) {
			return airportDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + airportId);
		}
	}

	@Override
	public List<Airports> getAllAirports() {
		return this.airportsRepository.findAll();
	}

	@Override
	public void deleteAirports(int airportId) {
		Optional<Airports> airportDb = this.airportsRepository.findById(airportId);
		if (airportDb.isPresent()) {
			this.airportsRepository.delete(airportDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + airportId);
		}
		
	}

	@Override
	public Airports updateAirports(Airports airport) {
		Optional<Airports> airportDb = this.airportsRepository.findById(airport.getId());
		if (airportDb.isPresent()) {
			Airports  airportUpdate = airportDb.get();
			airportUpdate.setId(airport.getId());
			//airportUpdate.setId_country(airport.getId_country());
			airportUpdate.setName(airport.getName());
			airportsRepository.save(airportUpdate);
			return airportUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + airport.getId());
		}
	}

	@Override
	public Airports createAirport(Airports airport) {
		return airportsRepository.save(airport);
	}
	

}
