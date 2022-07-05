create database db_ejercicio;

use db_ejercicio;

create table employee(
	id int auto_increment primary key,
	surname varchar(50) not null,
	firstname varchar(30) not null
);

create table languages(
	id int auto_increment primary key,
    id_employee int not null,
	code varchar(10) not null,
	name varchar(30) not null
);

create table country(
	id int auto_increment primary key,
    id_employee int not null,
	code varchar(10) not null,
	name varchar(30) not null
);

create table airport(
	id int auto_increment primary key,
    id_country int not null,
	name varchar(30) not null
);

-- ---------------- Llaves foraneas ---------------- -- 

alter table languages
	add constraint FK_languaje_idEmployee
    foreign key(id_employee)
   	references employee(id);

alter table country
	add constraint FK_country_idEmployee
    foreign key(id_employee)
   	references employee(id);

alter table airport
	add constraint FK_airport_idcontry
    foreign key(id_country)
   	references country(id);

-- Restriccion UNIQUE para id
alter table employee
	add constraint UNIQUE_employee_id
    unique (id);

alter table languages
	add constraint UNIQUE_languaje_id
    unique (id);
    
alter table country
	add constraint UNIQUE_country_id
    unique (id);

alter table airport
	add constraint UNIQUE_airport_id
    unique (id);

-- ------------Datos en las tablas------------ --
insert into employee (id, surname, firstname) values
	(1, 'Sanchez','Alejandro'),
    (2, 'Hernández','Gabriela'),
    (3, 'Trujillo','Iveth'),
    (4, 'Baltazar','Lizbeth'),
    (5, 'Marcos','Jorge'),
    (6, 'Angel','Magui'),
    (7, 'Rodriguez','Diego');
    
    
insert into languages (id, id_employee, code, name) values
	(1, 2, 'LAN001','Español'),
    (2, 4, 'LAN002','Español'),
    (3, 5, 'LAN003','Ingles'),
    (4, 6, 'LAN004','Ingles'),
    (5, 7, 'LAN005','Portugués');
    
insert into country (id, id_employee, code, name) values
	(1, 1, 'COU001','Tamaulipas'),
    (2, 3, 'COU002','Guerrero'),
    (3, 5, 'COU003','California'),
    (4, 7, 'COU004','Veracruz');
    
insert into airport (id, id_country, name) values
	(1, 1, 'Airport Tamaulipas'),
    (2, 2, 'Airport Guerrero'),
    (3, 4, 'Airport Veracruz');
    
select * from employee;
select * from languages;
select * from country;
select * from airport;

    
    
    
    