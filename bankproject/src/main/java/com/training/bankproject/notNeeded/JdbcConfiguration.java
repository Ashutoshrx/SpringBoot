package com.training.bankproject.notNeeded;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mysql.cj.protocol.Resultset;

import com.training.bankproject.repository.CustomersDao;

//@Repository
//@ComponentScan(basePackages = "com.training.bankproject")
//@PropertySource("classpath:application.properties")
public class JdbcConfiguration {
	public static final String URL = "jdbc:mysql://localhost:3306/mydb";
	public static final String USERNAME = "root";
	public static final String USERPASSWORD = "root";

	Connection dbCon;
	PreparedStatement prepstmnt;
	Statement stmnt;

	/*public JdbcConfiguration() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbCon = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
			System.out.println(
					"\n Thank You for choosing our XYZ bank. \n" + " You are getting redirected to our server ");
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load driver: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Connection Error:" + e.getMessage());
		}
	}*/

	/*public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbCon = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
			System.out.println(
					"\n Thank You for choosing our XYZ bank. \n" + " You are getting redirected to our server ");
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load driver: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Connection Error:" + e.getMessage());
		}
	}*/

}
