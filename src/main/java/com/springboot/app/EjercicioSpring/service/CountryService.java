package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import com.springboot.app.EjercicioSpring.model.Country;

public interface CountryService {
	
	//Obtener por id => FindById
	Country getCountrysById(int countryId);
		
	//Obtener todo => FindAl
	List<Country> getAllCountrys();
		
	//Eliminar => Delete
	void deleteCountrys(int id);

	//Actualizar => Update
	Country updateCountrys(Country country);
	
	Country createCountry (Country country);

}
