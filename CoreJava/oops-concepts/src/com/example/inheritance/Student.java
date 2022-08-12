package com.example.inheritance;

public class Student extends Person {
	private int rollNo;
	private String grade;
	
	public Student(int rollNo, String name, String gender, String grade) {
		super(name, gender);
		this.rollNo = rollNo;
		this.grade = grade;
		System.out.println("Student(int, String, String, String) constructor");
	}

	// overriding display in Student
	@Override
	public void display() {
		System.out.println("***********Student Display************");
		System.out.println("RollNo = "+getRollNo()+", Name = "+getName()
			+", Gender = "+getGender()+", Grade = "+getGrade());
	}
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
