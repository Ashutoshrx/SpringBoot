package com.training.springJpa.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springJpa.entity.Branch;
import com.training.springJpa.repository.BranchRepository;

@Service
public class BranchService {
	@Autowired
	BranchRepository repository;
	
	public List<Branch> getBranchByStudentRoll(Integer StudentRoll) {
		return repository.findByStudentRoll(StudentRoll);
	}
	
	public Optional<Branch> getBranchById(int branchId) {
		return repository.findById(branchId);
	}
	
	public Branch addBranch(Branch theBranch) {
		return repository.save(theBranch);
	}
	
	public Branch updateBranch(Branch theBranch) {
		return repository.save(theBranch);
	}
	
	public void deleteBranch(int branchId) {
		repository.deleteById(branchId);
	}
}
