package com.example.demo.person.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Persons;
import com.example.demo.repository.PersonRespository;

@RestController
@RequestMapping ("/api/v1/person")
public class PersonService {
	
	@Autowired
	private PersonRespository personRepos;
	
	@GetMapping()
	public List<Persons> getAllUsers () {
		return personRepos.findAll();
	}
	
	@GetMapping("/{id}")
	public Persons getPersonById (@PathVariable(value = "id")long userId) {
		return this.personRepos.findById(userId).get();
	}
	
	@PostMapping()
	public Persons addPerson (@RequestBody Persons person) {
		return this.personRepos.save(person);
	}
	
	@PutMapping("/{id}")
	public Persons modifyPerson (@RequestBody Persons person, @PathVariable(value = "id")long userId) {
		System.out.println("Inside Modify Person");

		Persons findPerson = this.personRepos.findById(userId).get();
		System.out.println(findPerson);
		
		findPerson.setName(person.getName());
		findPerson.setAge(person.getAge());
		findPerson.setGender(person.getGender());
		findPerson.setDob(person.getDob());
		System.out.println("After" + findPerson);
		
		return this.personRepos.save(findPerson);
	}
	
	
	
	


}
