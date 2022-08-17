package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LambdaDemo2 {

	public static void main(String[] args) {
		// Dummy Employees to create in a List<Employee> list = Arrays.asList(e1, e2, ...);
		List<Employee> list = Arrays.asList(
				new Employee(200, "Zaheer", 35000),
				new Employee(100, "Sachin", 45000),
				new Employee(500, "Dhoni", 65000),
				new Employee(400, "Virat", 85000),
				new Employee(300, "Yuvraj", 75000)
		);
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("1: Filter based salary, 2: Sort Employees based on their properties, 3: Exit");
			option = scanner.nextInt();
			switch(option) {
			case 1: 
				System.out.println("Enter salary:-");
				double salary = scanner.nextDouble();
				list.stream().filter(e -> e.getSalary() > salary).forEach(e -> System.out.println(e));
				break;
			case 2: 
				System.out.println("Enter Employee properties to sort like id, name and salary");
				String input = scanner.next();
				switch(input) {
				case "id": list.stream()
				.sorted((e1, e2) -> Integer.compare(e1.getId(), e2.getId())).forEach(e -> System.out.println(e));
					break;
				case "name": list.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
					.forEach(e -> System.out.println(e));
					break;
				case "salary": list.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
					.forEach(e -> System.out.println(e));
					break;
				}
				break;
			}
		} while(option != 3);
		System.out.println("____________ Program Exited ___________________");
		scanner.close();
	}
}
