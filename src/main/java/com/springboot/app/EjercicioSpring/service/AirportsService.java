package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import com.springboot.app.EjercicioSpring.model.Airports;


public interface AirportsService {
	
	//Obtener por id => FindById
	Airports getAirportsById(long airportId);
	
	//Obtener todo => FindAl
		List<Airports> getAllAirports();
	
	//Eliminar => Delete
	void deleteAirports(long id);

	//Actualizar => Update
	Airports updateAirports(Airports airport);	

}
