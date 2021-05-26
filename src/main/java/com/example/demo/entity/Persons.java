package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Persons")
public class Persons {
	
	@Id
	private long personId;
	
	//Person Name Column
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "dob")
	private String dob;
	
	public Persons () {};
	
	public Persons(long personId, String name, int age, String gender, String dob) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Persons [personId=" + personId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dob="
				+ dob + "]";
	}

	public long getPersonId() {
		return personId;
	}
	
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
