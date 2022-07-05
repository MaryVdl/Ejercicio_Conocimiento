package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.EjercicioSpring.model.Languages;

@Service
@Transactional
public class LanguageServiceImpl implements LanguageService{

	@Override
	public Languages getLanguagesById(long languageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Languages> getAllLanguages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLanguages(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Languages updateLanguages(Languages languaje) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
