package com.springboot.app.EjercicioSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.EjercicioSpring.model.Country;

@Repository
public interface CountrysRepository extends JpaRepository<Country, Integer>{

}
