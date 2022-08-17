package com.example;

import java.util.List;
import java.util.Scanner;

public class EmployeeMenuOption {
	
	// UI - takes care of I/P and O/P
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		// create EmployeeService object so that you can call their methods to perform save, fetchAll, fetch, and so on
		EmployeeService service = new EmployeeService();
		do {
			System.out.println("Enter options:-");
			System.out.println("1: Store Employee");
			System.out.println("2: Retrieve All Employees");
			System.out.println("3: Retrieve By Id");
			System.out.println("4: Delete Employee by Id");
			System.out.println("5: Sort the Employees");
			System.out.println("6: Exit");
			option = scanner.nextInt();
			switch(option) {
			case 1: 
				Employee employee = new Employee();
				System.out.println("Enter id: ");
				// waits for input and initializes id
				employee.setId(scanner.nextInt());
				System.out.println("Enter name: ");
				// waits for input and initializes name
				employee.setName(scanner.next());
				System.out.println("Enter salary");
				// waits for input and initializes salary
				employee.setSalary(scanner.nextDouble());
				int status = service.save(employee);
				if(status == 1) {
					System.out.println("Empoyee is saved :)");
				} else {
					System.err.println("Employee is not saved!");
				}
				break;
			case 2: 
				// call the fetchAll method and iterate the List<Employee>
				List<Employee> list = service.fetchAll();
				for(Employee emp : list) {
					System.out.println(emp);
				}
				break;
				// other cases you need to implement
			case 3: 
				
				break;
			case 4: break;
			case 5: break;
			}
		} while (option != 6);
		System.out.println("________________ Program Exits _____________________");
		scanner.close();
	}

}
