package com.training.bankproject;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bankproject.ui.UserConfiguration;

//@Configuration
//@ComponentScan(basePackages = {"com.training.bankproject.ui","com.training.bankproject.repository"})
public class BankApp {
	public static void main(String[] args) {
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfiguration.class);
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("configuration.xml");
		UserConfiguration userConfig= context.getBean(UserConfiguration.class);
		userConfig.run();
		
	}
}
