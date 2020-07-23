package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class userService {
	@Autowired
	private UserRepo repo2;
	
	public void saveUser(User user)
	{
		repo2.save(user);
	}
	

}
