package com.springboot.app.EjercicioSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.EjercicioSpring.exception.ResourceNotFoundException;
import com.springboot.app.EjercicioSpring.model.Languages;
import com.springboot.app.EjercicioSpring.repository.LanguagesRepository;

@Service
@Transactional
public class LanguageServiceImpl implements LanguageService{

	@Autowired
	private LanguagesRepository languageRepository;
	@Override
	public Languages getLanguagesById(long languageId) {
		Optional<Languages> lanDb = this.languageRepository.findById(languageId);
		if(lanDb.isPresent()) {
			return lanDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + languageId);
		}
	}

	@Override
	public List<Languages> getAllLanguages() {
		return this.languageRepository.findAll();
	}

	@Override
	public void deleteLanguages(long languageId) {
		Optional<Languages> lanDb = this.languageRepository.findById(languageId);
		if(lanDb.isPresent()) {
			this.languageRepository.delete(lanDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + languageId);
		}
		
	}

	@Override
	public Languages updateLanguages(Languages language) {
		Optional<Languages> lanDb = this.languageRepository.findById((long) language.getId());
		if(lanDb.isPresent()) {
			Languages lanUpdate = lanDb.get();
			lanUpdate.setId(language.getId());
			lanUpdate.setId_employee(language.getId_employee());
			lanUpdate.setCode(language.getCode());
			lanUpdate.setName(language.getName());
			return lanUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + language);
		}
	}

	@Override
	public Languages createLanguages(Languages language) {
		// TODO Auto-generated method stub
		return languageRepository.save(language);
	}
	

}
