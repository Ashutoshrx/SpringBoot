package com.training.bankproject.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.bankproject.entity.Customers;

@Repository
public interface CustomerDao {

	List<Customers> getCustomerDetailsById(String userLoginId);
	void createCustomer(Customers theCust);
	Customers getCustomerDetails(String userLoginId);

	
}
