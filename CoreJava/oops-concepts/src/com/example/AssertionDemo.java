package com.example;

public class AssertionDemo {

	public static void main(String[] args) {
		double amount = 6000;
		double balance = 5000;
		System.out.println("____________Assertion Demo______________");
		
		if(amount > balance) {
			assert false : "Amount > Balance";
		} else {
			balance = balance - amount;
			System.out.println("Amount is deducted, total balance: "+balance);
		}	
	}

}
