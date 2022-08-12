package example;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		// Scanner is used to take input from keyboard
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter a number");
//		int num = scanner.nextInt(); // waits for user to enter int value
//		System.out.println("Enter a text");
//		String text = scanner.next(); // waits for user to enter string value, it doesnt support multiple words or space
//		System.out.println("Number: "+num+", Text: "+text);
		
		// using switch take an input of numbers from 1 to 4, with switch print below messages based on the input
		// for 1 print Withdrawing, for 2 print Changing PIN, for 3 print Mini Statement, for 4 Print Exit
		// for other options print invalid option
		// syntax: switch(option) { case optionNumber: some stmt; break; case optionNumber: some stmt; break...}  
		
		System.out.println("Enter option:-");
		int option = scanner.nextInt();
		switch(option) {
		case 1: System.out.println("Withdraw");
		break;
		case 2: System.out.println("Change PIN");
		break;
		case 3: System.out.println("Mini Statement");
		break;
		case 4: System.out.println("Exit");
		break;
		default: System.out.println("Invalid option");
		}
		
		// close scanner resource after its used
		scanner.close();
	}
}
