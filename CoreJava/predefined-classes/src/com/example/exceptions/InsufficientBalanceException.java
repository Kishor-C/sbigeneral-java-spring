package com.example.exceptions;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super();
	}
	public InsufficientBalanceException(String err) {
		super(err); // you can get error message from getMessage()
	}
}
/*
 * Create a class AccountService with a debit(double amount) method that throws 
 * InsufficientBalanceException, when the amount is > balance, create a dummy balance = 5000
 * if amount is < balance subtract and return the remaining balance 
 * Create a class CustomExceptionDemo and call the debit method by passing amount
 * if debit deducts then print the remaining balance, 
 * if debit throws exception print the error message
 */
