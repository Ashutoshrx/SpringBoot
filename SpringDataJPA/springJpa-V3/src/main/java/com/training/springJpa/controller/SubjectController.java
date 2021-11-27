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
import org.springframework.web.bind.annotation.RestController;

import com.training.springJpa.entity.Student;
import com.training.springJpa.entity.Subject;
import com.training.springJpa.service.SubjectServie;

@RestController
public class SubjectController {

	@Autowired
	SubjectServie srv;
	
	@GetMapping("subject/{roll}")
	List<Subject> getSubjectByStudentRoll(@PathVariable int roll){
		return srv.getSubjectByStudentRoll(roll);
	}
	
	@GetMapping("subjects")
	Iterable<Subject> getAllSubjects() {
		return srv.getAllSubjects();
	}
	
//	@GetMapping("subject/{subjectId}")
//	Optional<Subject> getSubjectById(@PathVariable int subjectId) {
//		return srv.getSubjetById(subjectId);
//	}
	
	@PostMapping("addSubject/{roll}")
	void addSubject(@PathVariable int roll,@RequestBody Subject theSub) {
//		theSub.setStudent((List<Student>) new Student("","",roll));
		List<Student> listOfStudents=theSub.getStudent();
		listOfStudents.add(new Student("", "", roll));	
		theSub.setStudent(listOfStudents);
		srv.addSubject(theSub);
	}
	
	@PutMapping("updateSubject/{subjectId}")
	void updateSubjectById(@PathVariable int subjectId,@RequestBody Subject theSub) {
		srv.updateSubjectById(subjectId, theSub);
	}
	
	@DeleteMapping("deleteSubject/{subjectId}")
	void deleteById(int subjectId) {
		srv.deleteSubjectById(subjectId);
	}
	
}
