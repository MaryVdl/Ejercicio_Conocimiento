package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import com.springboot.app.EjercicioSpring.model.Airports;


public interface AirportsService {
	
	//Obtener por id => FindById
	Airports getAirportsById(int airportId);
	
	//Obtener todo => FindAl
		List<Airports> getAllAirports();
	
	//Eliminar => Delete
	void deleteAirports(int id);

	//Actualizar => Update
	Airports updateAirports(Airports airport);	
	
	Airports createAirport (Airports airport);

}
