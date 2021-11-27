package com.training.springJpa.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springJpa.entity.Subject;
import com.training.springJpa.repository.SubjectRepository;

@Service
public class SubjectServie {
	@Autowired
	SubjectRepository repo;
	
	public List<Subject> getSubjectByStudentRoll(int roll){
		return repo.findByStudentRoll(roll);
	}
	
	public Iterable<Subject> getAllSubjects() {
		return repo.findAll();
	}
		
	public void addSubject(Subject theSubject) {
		repo.save(theSubject);
		System.out.println("New subject has been added");
	}

	public void updateSubjectById(int id,Subject theSubject) {
		repo.save(theSubject);
		System.out.println("Subject has been updated");
	}
	public void deleteSubjectById(int id) {
		repo.deleteById(id);
		System.out.println("Subject removed from curriculam");
	}
}
