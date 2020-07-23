package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.userService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private userService repo1;
	
	@GetMapping("/")
	public String hello()
	{
		return "This is home page";
	}
	
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,@RequestParam String pass)
	{
		User user = new User(username,firstname,lastname,age,pass);
		
		repo1.saveUser(user);
		return "User Saved";
	}

}
