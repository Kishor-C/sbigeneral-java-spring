package com.example.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		// Employee constructor is calling default constructor of Person implicitly 
		Employee emp1 = new Employee(); // observe the flow of execution
		System.out.println("------------------");
		// Employee 4 arguments constructor is calling 2 arguments constructor of Person explicitly 
		Employee emp2 = new Employee(123, "Sachin", "Male", 45000); // observe the flow of execution
		
		// call getters of name, id, salary, gender from emp2 and print their values
		System.out.println("Id = "+emp2.getId()+", Name = "+emp2.getName()+
				", Gender = "+emp2.getGender()+", Salary = "+emp2.getSalary());
		// Note: though we don't have getName() and getGender() in Employee we are able to call because they are inherited.
	}
}
