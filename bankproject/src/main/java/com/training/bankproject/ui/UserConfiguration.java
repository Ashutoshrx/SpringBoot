package com.training.bankproject.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.training.bankproject.entity.Account;
import com.training.bankproject.entity.Customers;
import com.training.bankproject.repository.AccountDao;
import com.training.bankproject.repository.CustomerDao;

@Controller
public class UserConfiguration {
	
	int option,key;	
	Integer x[]= {5004001,5004002,5004003,50040056,5004087,5004006,5004007,5004099,5004009,5004100,5004011,5004012};
//	private CustomerDaoImp customersRef;
	@Autowired
	private CustomerDao custRef;
	@Autowired
	private AccountDao accRef;

	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n 1. Sign up  " + "\n 2. Log in " + " \n 3. Cancel Operation");


		do {
			System.out.println("\n Enter the option you want to choose:");
			option = sc.nextInt();
			switch (option) {
			case 1:
//				System.out.println("\n Enter your NAME, GENDER,USERPASSWORD,custId,LOGINID(@):");
				System.out.println("Please Enter you name:");
				String entName=sc.next();
				System.out.println("Please Enter you Gender:");
				String entGen=sc.next();
				System.out.println("Please Enter you Password:");
				String entPass=sc.next();
				System.out.println("Please Enter you custId:");
				int entCust=sc.nextInt();
				System.out.println("Please Enter you LoginId:");
				String entLoginId=sc.next();
				
				custRef.createCustomer(new Customers(entName,entGen,entLoginId,entCust,entPass));
				accRef.createAccount(new Account(0,entCust));
//				custRef.createCustomer(null);
				break;
			
			case 2:
				System.out.println("\nPlease enter your login Id:");
				String entLog=sc.next();
				System.out.println("\nPlease enter your password:");
				String entPwd=sc.next();
				
				do {
					System.out.println("\n Enter the option you want to choose:");
					System.out.println("\nCongragulations! you have been logged in.");
					System.out.println("\n 1.Show Account Details\n 2.Show Balance \n 3.Deposit Amount\n What would you like to do?");
					key=sc.nextInt();
					switch (key) {
					case 1:
						System.out.println("\nPlease find below your account details:");
						System.out.println(custRef.getCustomerDetails(entLog));
						break;
					case 2:
						break;
					case 3:
						break;
					default:
						System.out.println("\nSorry! Access denied.");
						
				}
				}while(key<2);
				break;
			default:
			System.out.println("\nThankyou for choosing us!");
			}

			System.out.println("\n 1. Sign up  " + "\n 2. Log in " + " \n 3.Cancel Operation");
		} while (option <= 2);
	}

}