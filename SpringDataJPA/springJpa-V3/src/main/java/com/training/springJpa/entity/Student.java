package com.training.springJpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roll;
	private String studName;
	private String location;
	
	 
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", studName=" + studName + ", location=" + location + "]";
	}

	public Student(String studName, String location,Integer roll) {
		this.studName = studName;
		this.location = location;
		this.roll=roll;
	}
	
	public Student(String studName, String location) {
		this.studName = studName;
		this.location = location;
	}

	public Student() {
		
	}

}
