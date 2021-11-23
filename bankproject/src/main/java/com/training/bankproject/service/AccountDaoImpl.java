package com.training.bankproject.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.training.bankproject.entity.Account;

import com.training.bankproject.repository.AccountDao;

@Service
public class AccountDaoImpl implements AccountDao {

	String query;
	DataSource dataSource;
//	NamedParameterJdbcTemplate namedParam;
	SqlParameterSource paramSource;
	JdbcTemplate jdbcTemplate;
//	
//	@Autowired
//	public void setDataSource(DataSource dataSource) {
//		namedParam = new NamedParameterJdbcTemplate(dataSource);
//	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
	}

	@Override
	public void createAccount(Account theAccount) {
		query="insert into account (accountNo,balance,custId) values(?,0,?)";
		jdbcTemplate.update(query,new Object[] {
				theAccount.getBalance(),
				theAccount.getCustId()
		});		
	}


	

}
