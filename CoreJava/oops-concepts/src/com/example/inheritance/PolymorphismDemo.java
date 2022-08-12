package com.example.inheritance;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Sachin", "Male");
		Employee e1 = new Employee(1234, "Jennifer", "Female", 35000);
		Student s1 = new Student(999, "Rajesh", "Male", "A");
		
		// calling display on each reference i.e., p1, e1, s1
//		p1.display();
//		System.out.println("-----------------------------");
//		e1.display();
//		System.out.println("-----------------------------");
//		s1.display();
		testPolymorphism(p1);
		testPolymorphism(e1);
		testPolymorphism(s1); // ensure display() is overridden in Student class
	}
	
	public static void testPolymorphism(Person p) { // p can accept person, employee, student object
		p.display(); // is polymorphic
	}

}
