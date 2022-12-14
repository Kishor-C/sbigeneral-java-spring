package com.example.exceptions;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		try {
			double balance = service.debit(4999);
			System.out.println("Amount debited, balance is: "+balance);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
	}
}
