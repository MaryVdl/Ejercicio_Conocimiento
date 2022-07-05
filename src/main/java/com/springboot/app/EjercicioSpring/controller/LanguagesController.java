package com.springboot.app.EjercicioSpring.controller;

import java.util.Locale.LanguageRange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/articulosropa")
public class LanguagesController {
	
	//Inyeccion de dependencias
	@Autowired
	private LanguageRange languagesService;
	
}
