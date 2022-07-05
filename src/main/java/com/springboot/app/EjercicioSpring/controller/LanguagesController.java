package com.springboot.app.EjercicioSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.EjercicioSpring.exception.Mensaje;
import com.springboot.app.EjercicioSpring.model.Languages;
import com.springboot.app.EjercicioSpring.service.LanguageService;


@RestController
@RequestMapping("/languages")
public class LanguagesController {

	@Autowired
	private LanguageService languageService;
	
	@GetMapping("/detallelanguage/{id}")
	public ResponseEntity<Languages> getLanguagesById(@PathVariable int id){
		return ResponseEntity.ok().body(languageService.getLanguagesById(id));
	}
	
	@GetMapping("/listalanguages")
	public ResponseEntity<?> getAllLanguages(){
		List<Languages> lista = languageService.getAllLanguages();
		if (lista.isEmpty()) {
			return new ResponseEntity<>(new Mensaje("Sin informacionen la  Base de Datos"), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(languageService.getAllLanguages());
	}
	
	@PutMapping("/actualizarlanguage/{id}")
	public ResponseEntity<Languages> updateLanguages(@PathVariable int id, @RequestBody Languages language){
		language.setId(id);
		return ResponseEntity.ok().body(languageService.updateLanguages(language));
	}
	
	@DeleteMapping("/eliminarlanguage/{id}")
	public HttpStatus deleteLanguage(@PathVariable int id) {
		this.languageService.deleteLanguages(id);
		return HttpStatus.OK;
	}
	
	
}
