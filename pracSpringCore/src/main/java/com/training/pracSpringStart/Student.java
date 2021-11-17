package com.training.pracSpringStart;

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
public class Student {
	private String netWorth;
	private int age;
	void learn() {
		System.out.println("Hi,I am learning, nahi padhunga bete.");
	}

}
