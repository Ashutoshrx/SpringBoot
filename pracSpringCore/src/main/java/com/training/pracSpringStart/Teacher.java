package com.training.pracSpringStart;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Teacher {
	private int salary;
	private String name;
//	private Student student;
	private Set<Student> stud;
	
	void teach() {
//		System.out.println("Hi, I am teaching.Padhai karlete hain bete.");
		System.out.println("My name is: "+name+" \nand my salary is: "+salary);
		System.out.println("Age & Net-worth:");
//		System.out.println("My age is: "+student.getAge()+"and my net worth is: "+student.getNetWorth());
		
		for(Student i:stud) {
			System.out.println(i.getAge()+", "+i.getNetWorth());
		}	
	}


}
