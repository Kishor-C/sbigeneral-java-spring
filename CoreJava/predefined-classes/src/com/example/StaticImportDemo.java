package com.example;
import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.Integer.parseInt; // converts string to int
import static java.lang.Double.parseDouble; // converts string to double
public class StaticImportDemo {
	public static void main(String[] args) {
		System.out.println("PI Value: "+PI); // no need of Math.PI
		double r = random(); // no need of Math.random
		System.out.println("Random value: "+r);
		double power = pow(2, 3); // no need of Math.pow
		int intValue = parseInt("50"); // no need of Integer.parseInt
		int result = intValue + 4;
		System.out.println("Result = "+result);
		double amount = parseDouble("487.8"); // no need of Double.parseDouble
		double result2 = amount + (amount * 0.18);
		System.out.println("Result2 = "+result2);
		System.out.println("Power: "+power);
		//int[] x = new int[]{1, 2, 3, 4, 5};
		test( new int[]{1, 2, 3, 5} ); // test accepting array of int
		System.out.println("------------");
		test(4, 8);
	}
	// create a var args method & pass array to it and in another call two or three arguments
	public static void test(int... x) {
		for(int i : x) {
			System.out.println("i = "+i);
		}
	}
}
