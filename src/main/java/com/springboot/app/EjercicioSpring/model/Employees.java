package com.springboot.app.EjercicioSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
create table employee(
	id int auto_increment primary key,
	surname varchar(50) not null,
	firstname varchar(30) not null
); */

@Entity 
@Table(name = "employee")
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "id_country")
	private int id_country;
	
	@Column(name = "id_language")
	private int id_language;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getId_country() {
		return id_country;
	}

	public void setId_country(int id_country) {
		this.id_country = id_country;
	}

	public int getId_language() {
		return id_language;
	}

	public void setId_language(int id_language) {
		this.id_language = id_language;
	}	

	

}
