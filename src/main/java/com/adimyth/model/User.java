package com.adimyth.model;

import jakarta.validation.constraints.NotEmpty;

//import org.hibernate.validator.constraints.NotBlank;

//import org.hibernate.validator.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;

public class User {

	
	@NotNull
	private String username;
	
	@NotNull
	private int age;
	
	@NotEmpty
	private String email;
	
	

	public User(String username, int age, String email) {
		super(); // constructor with fields
		this.username = username;
		this.age = age;
		this.email = email;
	}
	
	

	public User() {
		super();   // constructor without fields
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
