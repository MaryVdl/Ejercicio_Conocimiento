package com.springboot.app.EjercicioSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.EjercicioSpring.exception.ResourceNotFoundException;
import com.springboot.app.EjercicioSpring.model.Airports;
import com.springboot.app.EjercicioSpring.model.Employees;
import com.springboot.app.EjercicioSpring.repository.LanguagesRepository;

@Service //Indica que es un servicio
@Transactional
public class  EmployeeServiceImpl implements EmployeesService{

	@Override
	public Employees getEmployeesById(long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployees(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employees updateEmployees(Employees employee) {
		// TODO Auto-generated method stub
		return null;
	}


}
