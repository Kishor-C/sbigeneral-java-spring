package com.example.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee(123, "Sachin");
		Employee emp2 = new Employee(456, "Sourav");
		
		// accessing id & name directly is not possible i.e., emp1.id = 999;, emp1.name = "ABC";
		System.out.println("Id = "+emp1.getId()+", Name = "+emp1.getName());
		System.out.println("Id = "+emp2.getId()+", Name = "+emp2.getName());
		System.out.println("-------------Updating the name of 1st employee-------------");
		// emp1.name = "Sachin Tendulkar"; this doesn't work
		emp1.setName("Sachin Tendulkar");
		System.out.println("Id = "+emp1.getId()+", Name = "+emp1.getName());
		// Try to update name of Sourav to Sourav Ganguly and print id & name of that object
	}
}
