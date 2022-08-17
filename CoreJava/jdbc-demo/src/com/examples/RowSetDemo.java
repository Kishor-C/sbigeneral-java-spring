package com.examples;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

	public static void main(String[] args) {
		//If you use no need to create Connection, PreparedStatement, ResultSet and close these resources
		try {
			JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();
			rowset.setUsername("root");
			rowset.setPassword("root");
			rowset.setUrl("jdbc:mysql://localhost:3306/sbig?useSSL=false");
			rowset.setCommand("select * from employee");
			rowset.execute();
			List<Employee> list = new ArrayList<Employee>();
			while(rowset.next()) {
				Employee emp = new Employee();
				emp.setId(rowset.getInt("id"));
				emp.setName(rowset.getString("name"));
				emp.setSalary(rowset.getDouble("salary"));
				list.add(emp);
			}
			// no need to close any resources
			list.forEach(item -> System.out.println(item));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
