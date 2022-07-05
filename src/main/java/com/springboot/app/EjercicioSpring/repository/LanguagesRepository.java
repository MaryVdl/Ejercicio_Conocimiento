package com.springboot.app.EjercicioSpring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.EjercicioSpring.model.Airports;

@Repository
public interface LanguagesRepository extends JpaRepository<Airports, Integer>{
	
	@Transactional(readOnly = true)
	Optional<Airports> findById(int id);

}
