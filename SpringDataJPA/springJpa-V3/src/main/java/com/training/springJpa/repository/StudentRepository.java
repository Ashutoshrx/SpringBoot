package com.training.springJpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springJpa.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	List<Student> findByStudName(String name);
	
//	Student findByStudNameByFirstName(String name);
}
