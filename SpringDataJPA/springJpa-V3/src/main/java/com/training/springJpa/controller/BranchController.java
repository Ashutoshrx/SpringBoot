package com.training.springJpa.controller;


import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springJpa.entity.Branch;
import com.training.springJpa.entity.Student;
import com.training.springJpa.service.BranchService;

@RestController
@RequestMapping("/sampleApi")
public class BranchController {

	@Autowired
	BranchService service;

	@GetMapping("/branchByStudentRoll/{StudentRoll}")
	List<Branch> getBranchByStudentId(@PathVariable Integer StudentRoll) {
		return service.getBranchByStudentRoll(StudentRoll);
	}
	
	@GetMapping("branchById/{branchId}")
	Optional<Branch> getBranchById(@PathVariable int branchId) {
		return service.getBranchById(branchId);
	}
	
	@PostMapping("addBranch/{roll}")
	void addBranch(@RequestBody Branch theBranch,@PathVariable int roll) {
		theBranch.setStudent((Student) new Student("", "", roll));
		service.addBranch(theBranch);
		System.out.println("New Branch has been added.");
		
	}
	
	@PutMapping("updateBranch/{roll}")
	void updateBranchById(@PathVariable int roll,@RequestBody Branch theBranch) {
		theBranch.setStudent((Student) new Student("", "", roll));
		service.updateBranch(theBranch);
		System.out.println("The branch has been updated.");
	}
	
	@DeleteMapping("deleteBranch/{branchId}")
	void deleteBranchById(@PathVariable int branchId) {
		service.deleteBranch(branchId);
		System.out.println("The branch having "+branchId+" has been deleted.");
	}
}
