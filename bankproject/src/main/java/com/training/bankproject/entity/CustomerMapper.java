package com.training.bankproject.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.common.TemplateAwareExpressionParser;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper implements RowMapper<Customers> 
{
	@Autowired
	Customers theCustomer;
	@Override
	public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		theCustomer.setCustId(rs.getInt("custId"));
		theCustomer.setCustomerName(rs.getString("customerName"));
		theCustomer.setGender(rs.getString("gender"));
		theCustomer.setUserLoginId(rs.getString("userLoginId"));
		theCustomer.setUserPwd(rs.getString("userPwd"));
		
		return theCustomer;
	}
	

}
