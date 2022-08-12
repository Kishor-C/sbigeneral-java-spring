package com.example;

import com.example.inheritance.Student;

public class JarImportDemo {
	public static void main(String[] args) {
		Student student = new Student(1234, "Raj", "Male", "A");
		student.display();
	}
}
