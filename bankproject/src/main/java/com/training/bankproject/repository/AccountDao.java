package com.training.bankproject.repository;

import org.springframework.stereotype.Repository;

import com.training.bankproject.entity.Account;
@Repository
public interface AccountDao {
	
	void createAccount(Account theCustomer);

}
