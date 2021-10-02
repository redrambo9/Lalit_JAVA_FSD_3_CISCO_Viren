package com.project.app.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.model.Product;
import com.project.app.model.User;
import com.project.app.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserRepository userrepository;
	
	// to get all the users registered
	@GetMapping("getallusers")
	public List<User> getAllUsers()
	{
		List<User> user=(List<User>) userrepository.findAll();
		return user;
	}
	
	
	// to change admin password only
	String email = "admin@yahoo.com";
	@PutMapping("changepass/admin/{newpass}")
	public void updatepass(@PathVariable String newpass)
	{
		
		userrepository.findByChangePass(newpass,email);
		
	}
	
	
	

	
	
	
}

