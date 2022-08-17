package com.example;

@FunctionalInterface
interface X {
	int test();
}
@FunctionalInterface
interface Y {
	String demo(int x, int y);
}
@FunctionalInterface
interface Z {
	double add(int a, int b);
}
public class LambdaDemo {
	public static void main(String[] args) {
		// lambda expression doesn't need to use return keyword if it one line implementation
		X x1 = () ->  20;
		testX(x1); // passing reference
		System.out.println("------------------");
		testX(() -> 30); // passing method as argument
		System.out.println("------------------");
		Y y1 = (a, b) -> "Hello "+a+", Hello "+b;
		testY(y1);
		System.out.println("------------------");
		testY((x, y) -> "Hi "+x+", Hello "+y); // passing method as argument
		System.out.println("----------------------");
		testZ((a, b) -> a + b); // passing method as argument
	}
	public static void testX(X x) {
		int result = x.test();
		System.out.println("Test called and result = "+result);
	}
	public static void testY(Y y) {
		String result = y.demo(20, 30);
		System.out.println("Demo called and result = "+result);
	}
	public static void testZ(Z z) {
		double result = z.add(30, 40);
		System.out.println("Add called and result = "+result);
	}
}
