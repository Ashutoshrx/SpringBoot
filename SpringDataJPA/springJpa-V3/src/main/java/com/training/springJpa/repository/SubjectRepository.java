package com.training.springJpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springJpa.entity.Branch;
import com.training.springJpa.entity.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Integer> {
	
	List<Subject> findByStudentRoll(Integer roll);
}
