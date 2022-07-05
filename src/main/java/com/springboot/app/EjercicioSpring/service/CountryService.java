package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import com.springboot.app.EjercicioSpring.model.Countrys;

public interface CountryService {
	
	//Obtener por id => FindById
	Countrys getCountrysById(long countryId);
		
	//Obtener todo => FindAl
	List<Countrys> getAllCountrys();
		
	//Eliminar => Delete
	void deleteCountrys(long id);

	//Actualizar => Update
	Countrys updateCountrys(Countrys country);

}
