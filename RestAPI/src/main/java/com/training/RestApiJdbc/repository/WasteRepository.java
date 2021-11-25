package com.training.RestApiJdbc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.training.RestApiJdbc.entity.WasteBookEntity;
import com.training.RestApiJdbc.entity.WasteMapper;

@Repository
public class WasteRepository {
	@Autowired
	WasteBookEntity theEntity;
	@Autowired
	WasteMapper theMapper;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	NamedParameterJdbcTemplate namedParam;
	String query;

	public int getCountOfUsers() {
		query = "select count(*) from wastebook";
		return jdbcTemplate.queryForObject(query, Integer.class);
	}

	public void insertUser(WasteBookEntity tempBook) {
		query = "insert into wastebook(name,email,age,id) values(?,?,?,?)";
		jdbcTemplate.update(query,
				new Object[] { tempBook.getName(), tempBook.getEmail(), tempBook.getAge(), tempBook.getId() });
		System.out.println("Congragulations! Account has been created.");
	}

	public List<WasteBookEntity> getUsers() {
		query = "select * from wasteBook";
		return jdbcTemplate.query(query, theMapper);
	}

	public WasteBookEntity getUserById(int id) {
		query = "select * from wasteBook where id=?";
		return jdbcTemplate.queryForObject(query, theMapper, id);
	}

	public int updateNameById(int id,String name) {
		query = "update wasteBook set name=? where id=?";
		return jdbcTemplate.update(query,name,id);	
	}

	public int deleteById(int id) {
		query = "delete from wasteBook where id=?";
		return jdbcTemplate.update(query, id);
	}
}
