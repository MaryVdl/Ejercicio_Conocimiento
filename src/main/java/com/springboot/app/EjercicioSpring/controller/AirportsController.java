package com.springboot.app.EjercicioSpring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.EjercicioSpring.service.AirportsService;

@RestController
@RequestMapping("/airports")
public class AirportsController {
	
	//Inyeccion de dependencia
	@Autowired
	private AirportsService airportsService;
	
}
