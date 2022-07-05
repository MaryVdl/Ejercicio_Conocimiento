package com.springboot.app.EjercicioSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.EjercicioSpring.exception.Mensaje;
import com.springboot.app.EjercicioSpring.model.Employees;
import com.springboot.app.EjercicioSpring.service.EmployeesService;
import com.springboot.app.EjercicioSpring.service.LanguageService;

@RestController
@RequestMapping("/articulos")
public class EmployeesController {
	
	//Inyeccion de Dependencia
	@Autowired
	private EmployeesService employeesService; //Contiene metodo para realizar la consulta select

}
