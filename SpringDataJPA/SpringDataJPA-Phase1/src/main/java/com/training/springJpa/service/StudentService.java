package com.training.springJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.springJpa.entity.Student;
import com.training.springJpa.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;
	
	public Iterable<Student> getAllStudent() {
		return repo.findAll();
	}
	
	public Optional<Student> getStudentByRoll(int roll) {
		return repo.findById(roll);
	}

	public void addStuent(Student theStud) {
		repo.save(theStud);
		System.out.println("Congragualtion.Admission of the student is completed");
	}
	
	public void updateByRoll(int roll,Student theStud) {
		repo.save(theStud);
		System.out.println("The roll "+roll+" has been changed.");
	}
	
	public void deleteByRoll(int roll) {
		repo.deleteById(roll);
		System.out.println("The Student having "+roll+" has been deleted.");
	}
	
	
	public List<Student> findStudentByName(String studName){
		return repo.findByStudName(studName);
		
	}
	
//	public Student findByFirstName(String name) {
//		return repo.findByStudNameByFirstName(name);
//	}
//	
	
}
