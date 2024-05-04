package com.adimyth.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

//import org.hibernate.validator.constraints.NotBlank;

//import org.hibernate.validator.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;

public class User {

//	WE ARE PERFORMING HERE 1). VALIDATION USING @ANNOTATIONS 2). WE GONNA USE (@VALID ANNOTATION) 
//	3). WE GONNA USE EXCEPTION HENDALING  LAST BUT NOT LEAST  4). WE USE MESSAGE.PROPERTY FILE (SRC/MAIN/RESORCE  --> WE CREATE A FILE NAME(MESSAGE.PROPERTY))
	
	
	
//	@NotNull(message = "User name must not be null")
	@NotNull(message = "{user.name.notnull}")
	private String username;
	
//	@Min(value = 18 ,message = "Age msut be equal to or grater than 18")
//	@Max(value = 50 , message = "Age must be less than or equal to 50")
//	@NotNull(message = "Age must not be null")
//	
	@Min(value = 18 ,message = "{user.age.greater.than}")
	@Max(value = 50 , message = "{user.age.less.than}")
	@NotNull(message = "Age must not be null")
	
	
	private int age;
	
	@NotEmpty(message = "Email can't not be blank")
	@Email(message = "INVALID EMAIL ADDRESSSSSS!")
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
