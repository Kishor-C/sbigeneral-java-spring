package com.threads;

public class SynchronizationDemo {
	public static void main(String[] args) {
		TicketCounter tc = new TicketCounter();
		new Thread(tc, "A").start();
		new Thread(tc, "B").start();
		new Thread(tc, "C").start();
		
	}
}
