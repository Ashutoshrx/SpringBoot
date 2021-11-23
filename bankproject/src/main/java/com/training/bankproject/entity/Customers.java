package com.training.bankproject.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Component
public class Customers 
{
	private String customerName;
	private String gender;
	private String userPwd;
	private int custId;
	public String userLoginId;
	

}
