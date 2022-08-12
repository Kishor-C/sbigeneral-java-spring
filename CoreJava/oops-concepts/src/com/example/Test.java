package com.example;

public class Test {
	int x = 10;
	static int y = 20;
	
	Test() {
		System.out.println("Test() constructor");
	}
	
	Test(int x) {
		this.x = x;
		System.out.println("Test(int) constructor");
	}
	
	// static initializer block
	static {
		System.out.println("SIB");
	}
	
	// instance initializer block
	{
		System.out.println("IIB");
	}
	
}
