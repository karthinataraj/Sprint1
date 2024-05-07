package com.techi.Users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techi.Users.entity.User;
import com.techi.Users.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/user")
	public List<User> getUsers()
	{
		return repo.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id)
	{
		return repo.findById(id).get();
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user)
	{
		return repo.save(user);
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@RequestBody User user,@PathVariable Long id)
	{
		user.setId(id);
		return repo.save(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Long id)
	{
		repo.deleteById(id);
	}
	}
	
	
	
	
	
	
	
	
	
	

