package com.springBootJPASec10.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootJPASec10.Enitity.User;
import com.springBootJPASec10.Service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
	
	private UserService userService;
	
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}


	//build create REST-API
	// public -return type<> -method name -parameter
	//http://localhost:8080/api/users
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User savedUser =  userService.createUser(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
			System.out.println("sumit");
			//git push is completed
	}
	

}
