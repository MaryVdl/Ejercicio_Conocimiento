package com.springboot.app.EjercicioSpring.service;

import java.util.List;

import com.springboot.app.EjercicioSpring.model.Employees;


public interface EmployeesService {
	
	//Obtener por id => FindById
	Employees getEmployeesById(int employeeId);
			
	//Obtener todo => FindAl
	List<Employees> getAllEmployees();
			
	//Eliminar => Delete
	void deleteEmployees(int id);

	//Actualizar => Update
	Employees updateEmployees(Employees employee);
	
	Employees createEmployee(Employees employee);
}
