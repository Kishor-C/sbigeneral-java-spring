package com.example.exceptions;

public class AccountService {
	public double debit(double amount) throws InsufficientBalanceException {
		double balance = 5000; // fetch the balance from the account
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance: "
					+balance+", entered amount: "+amount);
		} else { 
			balance = balance - amount;
			// update the account balance in the DB
		}
		return balance;
	}
}
