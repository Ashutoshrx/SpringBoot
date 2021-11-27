package com.training.springJpa.controller;

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

import com.training.springJpa.entity.Student;
import com.training.springJpa.service.StudentService;

@RestController
@RequestMapping("/sampleApi")
public class StudentController 
{
	@Autowired
	StudentService srv;
	
	@GetMapping("students")
	Iterable<Student> getAllStudent() {
		return srv.getAllStudent();
	}
	
	@GetMapping("studentByRoll/{roll}")
	Optional<Student> getStudentByRoll(@PathVariable int roll) {
		return srv.getStudentByRoll(roll);
	}
	
	@PostMapping("addStudent")
	void addStudent(@RequestBody Student theStud) {
		srv.addStuent(theStud);
	}
	
	@PutMapping("updateByRoll/{roll}")
	void updateStudById(@PathVariable int roll, @RequestBody Student theStud) {
		srv.updateByRoll(roll, theStud);
	}
	
	@DeleteMapping("deleteByRoll/{roll}")
	void deleteById(@PathVariable int roll) {
		srv.deleteByRoll(roll);
	}
	
//	Added name in between to be less ambiguous.
	@GetMapping("findStudentByName/name/{studName}")
	List<Student> findStudentByName(@PathVariable String studName) {
		return srv.findStudentByName(studName);
	}
	
//	@GetMapping("findFirstName/name/{name}")
//	void findByFirstName(@PathVariable String name) {
//		if(srv.findByFirstName(name).getStudName().startsWith(name))
//			srv.findByFirstName(name);
//	}
}
