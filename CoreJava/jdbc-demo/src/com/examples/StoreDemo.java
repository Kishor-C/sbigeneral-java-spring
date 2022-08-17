package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class StoreDemo {

	public static void main(String[] args) {
		try {
			Class.forName(Driver.class.getName()); // ensure you are using mysql driver
			// getConnection(url, username, password)
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/sbig?useSSL=false", "root", "root");
			System.out.println("Connected: "+connection); // to test connection
			
			String query = "insert into employee values(?, ?, ?)";
			PreparedStatement pstmt = connection.prepareStatement(query);
			// ********** Ask Id, Name & Salary from Scanner 
			// Those Id, Name & Salary should initialize Employee object id, name & Salary
			// Pass the employee object id, name, salary to the setter methods of pstmt.************
			Scanner scanner = new Scanner(System.in);
			
			Employee emp = new Employee();
			System.out.println("Enter id");
			emp.setId(scanner.nextInt());
			pstmt.setInt(1, emp.getId()); // sets 1st ? to 111
			
			System.out.println("Enter name");
			emp.setName(scanner.next());
			pstmt.setString(2, emp.getName()); // sets 2nd ? to Sachin
			
			System.out.println("Enter salary");
			emp.setSalary(scanner.nextDouble());
			pstmt.setDouble(3, emp.getSalary()); // sets 3rd ? to 60000
			
			pstmt.executeUpdate(); // executes the update query 
			
			// keep this at the end
			scanner.close();
			pstmt.close();
			connection.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}

}
