package com.example;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println("main starts");
		Test t1 = new Test(); // IIB + Test()
		System.out.println("--------------------");
		Test t2 = new Test(35); // IIB + Test(int)
		System.out.println("main ends");
		// When does Static Block Executes?
	}
}
