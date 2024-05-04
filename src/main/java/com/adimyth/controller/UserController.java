package com.adimyth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adimyth.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/create")
	public ResponseEntity createUser(@RequestBody User user) 
	{
		return ResponseEntity.status(HttpStatus.CREATED).body("User Created sucessfully!!");
		
	}

}
