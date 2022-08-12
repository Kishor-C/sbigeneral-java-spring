package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	// takes the employee object and stores in employees.ser
	public int save(Employee employee) {
		// status 0 means not stored 1 means stored
		int status = 0;
		try {
			List<Employee> list = fetchAll(); // returns the employees present in the List or creates a list and returns it
			list.add(employee);
			// update the file with a new list, it rewrites the List present in file
			FileOutputStream fos = new FileOutputStream("employees.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// serialize the list having employees
			oos.writeObject(list);
			status = 1;
			oos.flush();
			oos.close();
		} catch(Exception e) {
			status = 0;
			System.err.println(e);
		}
		return status;
	}
	// returns all the Employees in a List, if List 
	// is not present in the file, creates the list & serializes that list in the file
	@SuppressWarnings("unchecked")
	public List<Employee> fetchAll() {
		List<Employee> list = null;
		try {
			FileInputStream fis = new FileInputStream("employees.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (List<Employee>)ois.readObject();
			ois.close();
		} catch(Exception e) {
			list = new ArrayList<Employee>();
			try {
				FileOutputStream fos = new FileOutputStream("employees.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(list);
				oos.flush();
				oos.close();
			} catch (Exception ex) {
				System.err.println(ex);
			}
		}
		return list;
	}
}
