//package com.training.bankproject.notNeeded;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.stereotype.Repository;
//
//@Repository
//@Configuration
//@ComponentScan(basePackages = "com.training.bankproject")
//@PropertySource(value = { "classpath:application.properties" })
//public class ApplicationConfig {
//
//	String query;
//	@Autowired
//	private Environment env;
//	
//	JdbcTemplate jdbcTemplate;
//	DataSource dataSource;
//
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
//		dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
//		dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
//		dataSource.setPassword(env.getRequiredProperty("jdbc.password"));
//		return dataSource;
//	}
//
//	@Bean
//	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		jdbcTemplate.setResultsMapCaseInsensitive(true);
//		return jdbcTemplate;
//	}
//	
//	@Autowired
////	public void setDataSource(DataSource dataSource) {
////		jdbcTemplate= new JdbcTemplate(dataSource);
////	}
//	
//	 public String getCustomerDetailsById(String userLoginId) {
//		query = "select * from customers where userLoginId = ?";
//		
//		return jdbcTemplate.queryForObject(query, String.class);
//	}
//
//}
