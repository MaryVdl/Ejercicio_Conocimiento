package com.springboot.app.EjercicioSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
create table country(
	id int auto_increment primary key,
    id_employee int not null,
	code varchar(10) not null,
	name varchar(30) not null
);*/

@Entity 
@Table(name = "country")
public class Country {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "id_airport")
	private int id_airport;
	
	@Column(name = " code")
	private String code;
	
	@Column(name = "name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getId_airport() {
		return id_airport;
	}

	public void setId_airport(int id_airport) {
		this.id_airport = id_airport;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}
