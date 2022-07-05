package com.springboot.app.EjercicioSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.EjercicioSpring.exception.Mensaje;
import com.springboot.app.EjercicioSpring.model.Employees;
import com.springboot.app.EjercicioSpring.service.EmployeesService;


@RestController
@RequestMapping("/apiv1")
public class EmployeesController {
	
	//Inyeccion de Dependencia
	@Autowired
	private EmployeesService employeesService; 
	
	@GetMapping("/detalleemployee/{id}")
	public ResponseEntity<Employees> getEmployeesById(@PathVariable int id){
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
	
	@PutMapping("/actualizaremployees/{id}")
	public ResponseEntity<Employees> updateEmployees (@PathVariable int id, @RequestBody Employees employee){
		employee.setId(id);
		return ResponseEntity.ok().body(this.employeesService.createEmployee(employee));
	}
	
	//Delete
	@DeleteMapping("/eliminaremployee/{id}")
	public HttpStatus deleteEmployee(@PathVariable int id) {
		this.employeesService.deleteEmployees(id);
		return HttpStatus.OK;
	}
	
	@PostMapping("/employees/add")
	public ResponseEntity<Employees> createEmployee(@RequestBody Employees employee){
		return ResponseEntity.ok().body(this.employeesService.createEmployee(employee));
	}

}
