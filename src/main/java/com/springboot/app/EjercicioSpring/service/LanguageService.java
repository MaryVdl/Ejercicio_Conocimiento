package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import com.springboot.app.EjercicioSpring.model.Languages;


public interface LanguageService {
	

	//Obtener Language por id
	Languages getLanguagesById(long languageId);
				
	//Obtener todo => FindAl
	List<Languages> getAllLanguages();
				
	//Eliminar => Delete
	void deleteLanguages(long id);

	//Actualizar => Update
	Languages updateLanguages(Languages language);

	Languages createLanguages(Languages language);
}
