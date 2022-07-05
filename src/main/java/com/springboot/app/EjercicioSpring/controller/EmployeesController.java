package com.springboot.app.EjercicioSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.EjercicioSpring.exception.Mensaje;
import com.springboot.app.EjercicioSpring.model.Employees;
import com.springboot.app.EjercicioSpring.service.EmployeesService;


@RestController
@RequestMapping("/employees")
public class EmployeesController {
	
	//Inyeccion de Dependencia
	@Autowired
	private EmployeesService employeesService; 
	
	@GetMapping("/detalleemployee/{id}")
	public ResponseEntity<Employees> getEmployeesById(@PathVariable long id){
		return ResponseEntity.ok().body(employeesService.getEmployeesById(id));
	}
	
	@GetMapping("/listaemployees")
	public ResponseEntity<?> getAllEmployees(){
		List<Employees> lista = employeesService.getAllEmployees();
		if (lista.isEmpty()) {
			return new ResponseEntity<>(new Mensaje("Sin informacionen la  Base de Datos"), HttpStatus.BAD_REQUEST);	
		}
		return ResponseEntity.ok().body(employeesService.getAllEmployees());
	}
	
	@GetMapping("/actualizaremployees")
	public ResponseEntity<Employees> updateEmployees (@PathVariable long id, @RequestBody Employees employee){
		employee.setId((int) id);
		return ResponseEntity.ok().body(this.employeesService.createEmployee(employee));
	}
	
	//Delete
	

}
