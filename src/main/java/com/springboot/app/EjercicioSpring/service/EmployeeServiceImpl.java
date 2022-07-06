package com.springboot.app.EjercicioSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.EjercicioSpring.exception.ResourceNotFoundException;
import com.springboot.app.EjercicioSpring.model.Employees;
import com.springboot.app.EjercicioSpring.repository.EmployeesRepository;

@Service //Indica que es un servicio
@Transactional
public class  EmployeeServiceImpl implements EmployeesService{
	
	@Autowired
	private EmployeesRepository employeeRepository;

	@Override
	public Employees getEmployeesById(int employeeId) {
		Optional<Employees> empDb = this.employeeRepository.findById(employeeId);
		if (empDb.isPresent()) {
			return empDb.get();
			
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + employeeId);
		}
	}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return this.employeeRepository.findAll();
	}

	@Override
	public void deleteEmployees(int employeeId) {
		Optional<Employees> empDb = this.employeeRepository.findById(employeeId);
		if(empDb.isPresent()) {
			this.employeeRepository.delete(empDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + employeeId);
		}
		
	}

	@Override
	public Employees updateEmployees(Employees employee) {
		Optional<Employees> empDb = this.employeeRepository.findById(employee.getId());
		if (empDb.isPresent()) {
			Employees empUpdate = empDb.get();
			empUpdate.setId(employee.getId());
			empUpdate.setSurname(employee.getSurname());
			empUpdate.setFirstname(employee.getFirstname());
			empUpdate.setId_country(employee.getId_country());
			empUpdate.setId_language(employee.getId_language());
			employeeRepository.save(empUpdate);
			return empUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + employee.getId());
		}
	}

	@Override
	public Employees createEmployee(Employees employee) {
		return employeeRepository.save(employee);
	}


}
