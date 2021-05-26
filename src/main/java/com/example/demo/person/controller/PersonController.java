package com.example.demo.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Persons;
import com.example.demo.person.service.PersonService;


public class PersonController {
	
	@Autowired 
	private PersonService service;
	
	public List<Persons> getAllPersons(){
		return this.service.getAllUsers();
	}
	
	public Persons getPersonById (long userId) {
		return this.service.getPersonById(userId);
	}
	
	public Persons createPerson (Persons person) {
		return this.service.addPerson(person);
	}
	
	public Persons editPerson (Persons person, long userId) {
		return this.service.modifyPerson(person, userId);
	}
	

}
