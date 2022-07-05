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
import com.springboot.app.EjercicioSpring.model.Airports;
import com.springboot.app.EjercicioSpring.service.AirportsService;


@RestController
@RequestMapping("/airports")
public class AirportsController {
	
	//Inyeccion de dependencia
	@Autowired
	private AirportsService airportsService;
	
	//Obtener por id
	@GetMapping ("/detalleairport/{id}")
	public ResponseEntity<Airports> getAirportsById(@PathVariable long id){
		return ResponseEntity.ok().body(airportsService.getAirportsById(id));
		
	}
	
	//Obtener todo
	@GetMapping ("/listaairports")
	public ResponseEntity<?> getAllAirports(){
		List<Airports> lista = airportsService.getAllAirports();
		if(lista.isEmpty()) {
			return new ResponseEntity<>(new Mensaje("Sin informacionen la  Base de Datos"), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(airportsService.getAllAirports());
	}

	
	// delete
	
	
	// update
	@GetMapping ("/actualizarairport")
	public ResponseEntity<Airports> updateAirports(@PathVariable long id, @RequestBody Airports airport){
		airport.setId((int) id);
		return ResponseEntity.ok().body(this.airportsService.createAirport(airport));
		
	}
	
}
