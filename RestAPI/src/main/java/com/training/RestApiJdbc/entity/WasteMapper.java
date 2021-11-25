package com.training.RestApiJdbc.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class WasteMapper implements RowMapper<WasteBookEntity> {

//	@Autowired
//	WasteBookEntity tempBook;
	
	@Override
	public WasteBookEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		WasteBookEntity tempBook= new WasteBookEntity();
		tempBook.setName(rs.getString("name"));
		tempBook.setEmail(rs.getString("email"));
		tempBook.setAge(rs.getInt("age"));
		tempBook.setId(rs.getInt("id"));
		
		return tempBook;
	}
	

}
