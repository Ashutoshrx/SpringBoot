package com.training.bankproject.service;


import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.training.bankproject.entity.CustomerMapper;
import com.training.bankproject.entity.Customers;
import com.training.bankproject.repository.CustomerDao;

@Service
public class CustomerDaoImp implements CustomerDao {

	String query;
	DataSource dataSource;
	NamedParameterJdbcTemplate namedParam;
	SqlParameterSource paramSource;
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource1(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		namedParam = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Customers> getCustomerDetailsById(String userLoginId) {
		query = "select customerName from customers where userLoginId = :uLogId";
		paramSource = new MapSqlParameterSource("uLogId", userLoginId);
		return namedParam.query(query, paramSource, new CustomerMapper());
	}

	@Override
	public void createCustomer(Customers theCustomer) {
		query = "INSERT INTO customers(customerName,gender,userPwd,custId,userLoginId) values(?,?,?,?,?)";
		
		jdbcTemplate.update(query,new Object[]
				{
					theCustomer.getCustomerName(),
					theCustomer.getGender(),
					theCustomer.getUserLoginId(),
					theCustomer.getCustId(),
					theCustomer.getUserPwd()
				});
		System.out.println("Congragulations! Account has been created.");
		
	}
	
	@Autowired
	CustomerMapper custMapper;
	@Override
	public Customers getCustomerDetails(String userLoginId) {
		query="select * from customers where userLoginId=?";
		
		return jdbcTemplate.queryForObject(query,new Object[] {userLoginId} , custMapper);
	}
	
	
	


}
