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
import com.springboot.app.EjercicioSpring.model.Country;
import com.springboot.app.EjercicioSpring.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/detallecountry/{id}")
	public ResponseEntity<Country> getCountryById(@PathVariable int id){
		return ResponseEntity.ok().body(countryService.getCountrysById(id));
	}
	
	@GetMapping("/listacountrys")
	public ResponseEntity<?> getAllCountrys(){
		List<Country> lista = countryService.getAllCountrys();
		if (lista.isEmpty()) {
			return new ResponseEntity<>(new Mensaje("Sin informacionen la  Base de Datos"), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(countryService.getAllCountrys());
	}
	@DeleteMapping("eliminarCountry/{id}")
	public HttpStatus deleteCountry(@PathVariable int id) {
		this.countryService.deleteCountrys(id);
		return HttpStatus.OK;
	}
	@PutMapping("/actualizarcountry/{id}")
	public ResponseEntity<Country> updateCountrys(@PathVariable int id, @RequestBody Country country){
		country.setId((int) id);
		return ResponseEntity.ok().body(this.countryService.createCountry(country));
		
	}
	
	@PostMapping("/countryadd")
	public ResponseEntity<Country> createCountry(@RequestBody Country country){
		return ResponseEntity.ok().body(this.countryService.createCountry(country));
	}
	

}
