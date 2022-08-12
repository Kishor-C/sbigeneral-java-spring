package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Ramesh", 40000);
		Employee e2 = new Employee(5, "Sachin", 20000);
		Employee e3 = new Employee(15, "Virat", 30000);
		Employee e4 = new Employee(20, "Ajay", 10000);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);	list.add(e2);	list.add(e3);	list.add(e4);
		// Comparator for ascending order, through anonymous class implementation 
		Comparator<Employee> compareId = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return Integer.compare(o1.getId(), o2.getId());
			}
		}; // ensure in-line implementation (anonymous class) has a semicolon
		System.out.println("______________Before Sort__________________");
		for(Employee e : list) {
			System.out.println(e);
		}
		Collections.sort(list, compareId);
		System.out.println("______________After Sort___________________");
		for(Employee e : list) {
			System.out.println(e);
		}
		// Try out implementing Comparator to sort employees based on salary and based on name
		// Display the employees that are sorted by salary and another one displays the employees that are sorted by name
	}
}
