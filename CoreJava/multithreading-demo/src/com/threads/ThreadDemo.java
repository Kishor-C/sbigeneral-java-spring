package com.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		R r = new R();
		Thread t1 = new Thread(r, "A"); // internally calls setName("A")
		Thread t2 = new Thread(r, "B"); // internally calls setName("B")
		Thread t3 = new Thread(r, "C"); // internally calls setName("C")
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("___________main method exits______________");
		
	}
}
