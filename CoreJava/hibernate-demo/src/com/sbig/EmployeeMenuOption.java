package com.sbig;

import java.util.List;
import java.util.Scanner;


public class EmployeeMenuOption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		// create EmployeeService object so that you can call their methods to perform save, fetchAll, fetch, and so on
		System.out.println("Enter 1 to use JDBC and 2 to use Hibernate");
		option = scanner.nextInt();
		EmployeeService service = null;
		if(option == 1) {
			service = new EmployeeServiceJdbcImpl();
		} else if(option == 2) {
			service = new EmployeeServiceHibernateImpl();
		} else {
			service = new EmployeeServiceHibernateImpl();
		}
		do {
			System.out.println("Enter options:-");
			System.out.println("1: Store Employee");	System.out.println("2: Fetch All Employees");
			System.out.println("3: Fetch by Id");  		System.out.println("4: Update Salary by Id");
			System.out.println("5: Delete by Id");		System.out.println("6: Exit");
			option = scanner.nextInt();
			switch(option) {
			case 1: 
				Employee employee = new Employee();
				System.out.println("Enter id: ");		employee.setId(scanner.nextInt());
				System.out.println("Enter name: ");		employee.setName(scanner.next());
				System.out.println("Enter salary");		employee.setSalary(scanner.nextDouble());
				int status = service.save(employee);
				if(status >= 1) {
					System.out.println("Empoyee is saved :)");
				} else {
					System.err.println("Employee is not saved!");
				}
				break;
			case 2: 
				// call the fetchAll method and iterate the List<Employee>
				List<Employee> list = service.fetchEmployees();
				list.forEach(emp -> System.out.println(emp));
				break;
				// other cases not implemented yet!!
			case 3: 
				System.out.println("Enter id");
				int id = scanner.nextInt();
				Employee e = service.fetchEmployee(id);
				if ( e != null ) {
					System.out.println("_____________ "+id+" found ______________");
					System.out.println("Name = "+e.getName()+", Salary = "+e.getSalary());
				} else {
					System.err.println("____ Sorry "+id+" not found! ___________");
				}
				break;
			case 4: 
				System.out.println("Enter id");
				id = scanner.nextInt();
				System.out.println("Enter salary");
				double salary = scanner.nextDouble();
				status = service.update(id, salary);
				if(status >= 1) {
					System.out.println("Employee Updated");
				} else {
					System.err.println(id+" not found!");
				}
				break;
			case 5: 
				System.out.println("Enter id");
				id = scanner.nextInt();
				status = service.delete(id);
				if(status >= 1) {
					System.out.println("Employee Deleted!");
				} else {
					System.err.println(id+" not found!");
				}
				break;
			}
		} while (option != 6);
		System.out.println("________________ Program Exits _____________________");
		scanner.close();
	}

}
