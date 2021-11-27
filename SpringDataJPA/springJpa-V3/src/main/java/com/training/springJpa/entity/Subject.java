package com.training.springJpa.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Subject {
	
	@Id
	private Integer id;
	private String name;
	
	@ManyToMany
	@JoinTable(name="studentEnrolled",
	joinColumns = @JoinColumn(name="subjectId"),
	inverseJoinColumns = @JoinColumn(name="studentRoll"))
	List<Student> student= new ArrayList<>();
	
	
	public Subject(int id, String name,Integer roll) {
		this.id = id;
		this.name = name;
		this.student.add(new Student("","",roll));
	}
	

}
