package com.sbig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class EmployeeService {

	// we will have 3 methods here save(Employee), fetchAll: List, fetch(int): Employee
	public int save(Employee employee) {
		// -1 if fails, +1 if success
		int status = -1; // change to +1 if success
		try {
			Class.forName(Driver.class.getName());
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/sbig?useSSL=false", "root", "root");
			
			String query = "insert into employee values(?, ?, ?)";
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setDouble(3, employee.getSalary());
			pstmt.executeUpdate();
			// do this at the end
			pstmt.close();
			connection.close();
			// change status to +1
			status = 1;
		} catch(Exception e) {
			status = -1;
		}
		return status;
	}
	// fetchEmployees that returns List<Employee>
	public List<Employee> fetchEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		// each employee records you fetch should be initialized as Employee object and add in a List
		try {
			Class.forName(Driver.class.getName());
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/sbig?useSSL=false", "root", "root");
			String query = "select * from employee";
			PreparedStatement pstmt = connection.prepareStatement(query);
			ResultSet result = pstmt.executeQuery();  
					
			while( result.next() ) {
				Employee employee = new Employee(); // employee [id = 0, name = null, salary = 0.0
				employee.setId(result.getInt("id")); // employee [id = value, name = null, salary = 0.0
				employee.setName(result.getString("name")); // employee[id=value, name=value..]	
				employee.setSalary(result.getDouble("salary"));
				list.add(employee);
			}
			
			result.close();	
			pstmt.close();
			connection.close();
		} catch(Exception e) {
			list = null;
		}
		return list;
	}
}
