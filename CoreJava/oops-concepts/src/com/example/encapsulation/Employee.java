package com.example.encapsulation;

public class Employee {
	// make properties private
	private int id;
	private String name;
	
	// create constructor to initialize id & name both
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	
}
