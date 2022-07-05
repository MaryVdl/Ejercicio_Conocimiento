package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import com.springboot.app.EjercicioSpring.model.Countrys;

public interface CountryService {
	
	//Obtener por id => FindById
	Countrys getCountrysById(int countryId);
		
	//Obtener todo => FindAl
	List<Countrys> getAllCountrys();
		
	//Eliminar => Delete
	void deleteCountrys(int id);

	//Actualizar => Update
	Countrys updateCountrys(Countrys country);
	
	Countrys createCountry (Countrys country);

}
