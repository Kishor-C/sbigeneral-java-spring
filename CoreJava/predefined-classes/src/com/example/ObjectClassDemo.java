package com.example;

public class ObjectClassDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1234, "Sachin", 345000);
		Employee e2 = new Employee(4567, "Virat", 440000);
		System.out.println(e1);  // toString() of Object -> returns classname@MemoryAddress
		System.out.println(e2);  // toString() needs to be overridden to return properties 
		// if you want to print only name use e1.getName() 
	}
}
