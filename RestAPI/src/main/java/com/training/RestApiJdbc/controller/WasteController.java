package com.training.RestApiJdbc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.RestApiJdbc.entity.WasteBookEntity;
import com.training.RestApiJdbc.repository.WasteRepository;

@RestController
@RequestMapping("/wastebook")
public class WasteController {

	
	@Autowired
	WasteRepository repo;	

	@GetMapping("count")
	int getCountOfUsers() {
		return repo.getCountOfUsers();
	}

	@PostMapping("addUser")
	void insertUser(@RequestBody WasteBookEntity theBook) {
		repo.insertUser(theBook);
	}

	@GetMapping("allUsers")
	List<WasteBookEntity> showUsers() {
		return repo.getUsers();
	}
	
	@GetMapping("getUserById/{id}")
	WasteBookEntity getUserById(@PathVariable int id ) {
		return repo.getUserById(id);
	}
	
	@PutMapping("updateUserById/{id}")
	int updateUserById(@PathVariable int id,@RequestBody  String name ) {
		return repo.updateNameById(id, name);
	}
	
	@DeleteMapping("deleteById/{id}")
	int deleteById(@PathVariable int id) {
		return repo.deleteById(id);
	}
}
