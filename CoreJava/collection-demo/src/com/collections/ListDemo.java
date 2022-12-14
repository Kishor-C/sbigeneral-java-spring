package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Ramesh", 40000);
		Employee e2 = new Employee(5, "Sachin", 20000);
		Employee e3 = new Employee(15, "Virat", 30000);
		Employee e4 = new Employee(20, "Ajay", 10000);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);	list.add(e2);	list.add(e3);	list.add(e4);
		// You can iterate using Iterator or enhanced for loop
		int id = 25;
		Employee emp = null;
		for(Employee temp : list) {
			if(temp.getId() == id) {
				emp = temp;
				break;
			}
		}
		if(emp != null) {
			System.out.println(emp);
		} else {
			System.err.println("Id "+id+" not found!");
		}
	}
}
