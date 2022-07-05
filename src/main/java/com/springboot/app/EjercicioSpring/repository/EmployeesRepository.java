package com.springboot.app.EjercicioSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.EjercicioSpring.model.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {

}
