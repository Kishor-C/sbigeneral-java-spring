package com.example.inheritance;

public class Person {
	private String name;
	private String gender;
	public Person() {
		System.out.println("Person() constructor");
	}
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		System.out.println("Person(String, String)");
	}
	// display method to print name & gender
	public void display() {
		System.out.println("************Person Display**************");
		System.out.println("Name = "+name+", Gender = "+gender);
	}
	// Use Shortcut to generate Setters, Getters for name & gender
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
