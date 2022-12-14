package com.example.exceptions;

import java.sql.SQLException;

public class ExceptionsDemo {
	
	// no matter whether this throws exception or not, while calling you must use try-catch
	public static void store() throws SQLException {
		System.out.println("store() method is called");
		double random = Math.random();
		if(random > 0.5) {
			throw new SQLException("SQLException occured, because random number is: "+random);
		}
	}
	// compiler ignores unchecked exception and doesn't expect to call this within try-catch 
	public static void div() throws ArithmeticException {
		System.out.println("div() method is called");
		// generate random number and throw ArithmeticException when random number > 0.5 and observe what happens
		// check whether main ends is printing after div() is executed!
		double random = Math.random();
		if(random > 0.5) {
			throw new ArithmeticException("ArithmeticException occured, because random number is: "+random);
		}
	}
	// create a main method & call store() and div() in main() 
	public static void main(String[] args) {
		System.out.println("***** main starts *****");
		try {
			store();
		} catch(SQLException e) {
			System.err.println(e); // prints entire exception details along with main error message
			System.err.println(e.getMessage()); // prints the main error message
		}
		// call div() method and observe what happens
		div();
		System.out.println("***** main ends *****");
	}
}
