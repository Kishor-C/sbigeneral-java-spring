package com.example.inheritance;

public class Employee extends Person {
	private int id;
	private double salary;
	
	// Note: By default every constructor in the sub-class calls automatically their super class default constructor
	public Employee(int id, String name, String gender, double salary) {
		super(name, gender); // calls super class constructor taking 2 arguments i.e., Person(String, String)
		// if you don't use super(name, gender) then you must use setName(name) and setGender(gender) to initialize
		//setName(name);
		//setGender(gender);
		this.id = id;
		this.salary = salary;
		System.out.println("Employee(int, String, String, double)");
	}
	// Note: By default every constructor in the sub-class automatically calls their super class default constructor
	public Employee() {
		
		System.out.println("Employee()");
	}
	
	// override display method of Person in Employee
	@Override // checks whether method is present in super class
	public void display() {
		System.out.println("**********Employee Display************");
		System.out.println("Id = "+getId()+", Name = "+getName()+", Gender = "+getGender()+", Salary = "+getSalary());
	}
	
	// Generate setters, getters for id & salary
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
