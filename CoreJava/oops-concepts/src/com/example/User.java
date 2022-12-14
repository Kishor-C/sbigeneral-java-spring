package com.example;

public class User {
	// instance variables
	String name;
	int age;
	// static variable
	static int userCounter = 0; // User.userCounter is used to access static counter outside the class
	
	// constructor: name will be same as class with no return type
	User() {
		System.out.println("User() constructor");
	}
	User(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("User(String, int) constructor");
	}
	// IIB for User object
	{
		userCounter++;
	}
	// method that displays name and age
	void userDetails() {
		System.out.println("Name = "+name+", Age = "+age);
	}
	// User.printUserCounter() is used to access static method outside the class
	static void printUserCounter() {
		System.out.println("User Count: "+userCounter);
	}
}
