package com.training.springJpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Branch {

	@Id
	private int branchId;
	private String branchName;
	@OneToOne
	private Student student;
	
	public Branch() {
	}

	public Branch(int branchId, String branchName,Integer roll) {
		this.branchId = branchId;
		this.branchName = branchName;
		this.student=new Student("","",roll);
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", student=" + student + "]";
	}

	/*public Branch(int branchId, String branchName, Student student) {
		this.branchId = branchId;
		this.branchName = branchName;
		this.student = student;
	}*/

}
