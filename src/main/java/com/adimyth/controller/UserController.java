package com.adimyth.controller;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adimyth.model.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("/create")
	public ResponseEntity createUser(@Valid @RequestBody User user, BindingResult result) {

		if (result.hasErrors()) {
			List<String> errormessageList = result.getAllErrors().stream()
					.map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());

			return ResponseEntity.badRequest().body(errormessageList);

			// error message DEFAULTMESSAGESOURESOLVABLE message given by the compiler we
			// are going to solve that problem
		}
		return ResponseEntity.status(HttpStatus.CREATED).body("User Created sucessfully!!");

//		@Valid  : when we validate something, we're making sure it’s the right choice or the right answer.

	}

// we use BindingResult here for (The BindingResult is like your friend who helps check if everything you've entered is correct. When you submit the form, the app uses BindingResult to check each piece of information you've entered. If everything looks good, your profile gets saved without any issues.)

}
