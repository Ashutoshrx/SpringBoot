package com.training.springJpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.training.springJpa.entity.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Integer> {

	List<Branch> findByStudentRoll(Integer roll);
}
