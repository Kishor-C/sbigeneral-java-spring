package example;

import java.util.Scanner;

public class SwitchWithLoop {
	public static void main(String[] args) {
		//String[] departments = {"HR", "IT", "Account", "Finance"};
		Scanner scanner = new Scanner(System.in);
		int option;
		do {
			double salary = 5000;
			System.out.println("Current value of salary: "+salary);
			System.out.println("Enter department name:-");
			String departmentName = scanner.next();
			switch(departmentName) {
			case "HR": salary = salary + (salary * 0.2);
				System.out.println("HR Salary is: "+salary);
				break;
			case "IT": salary = salary + (salary * 0.15);
				System.out.println("IT Salary is: "+salary);
				break;
			case "Account": salary = salary + (salary * 0.1);
				System.out.println("Account salary is: "+salary);
				break;
			case "Finance": salary = salary + (salary * 0.05);
				System.out.println("Finance salary is: "+salary);
				break;
			default: System.out.println("Invalid Department name");
			}
			System.out.println("Do you wish to continue, if not enter -1 to exit");
			option = scanner.nextInt();
		} while(option != -1);
		scanner.close();
		System.out.println("Program Exited");
	}
}
