package com.springboot.app.EjercicioSpring.model;

import javax.persistence.Column;

/*
 * create table languages(
	id int auto_increment primary key,
    id_employee int not null,
	code varchar(10) not null,
	name varchar(30) not null
);
 * */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "languages")
public class Languages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	/*@Column(name = "id_employee")
	private int id_employee;*/
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public int getId_employee() {
		return id_employee;
	}

	public void setId_employee(int id_employee) {
		this.id_employee = id_employee;
	}*/

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
