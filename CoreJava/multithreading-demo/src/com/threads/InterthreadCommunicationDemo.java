package com.threads;

public class InterthreadCommunicationDemo {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Thread(counter, "A").start();
		new Thread(counter, "B").start();
		new Thread(counter, "C").start();
	}
}
