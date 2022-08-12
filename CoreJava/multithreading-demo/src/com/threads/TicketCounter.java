package com.threads;

public class TicketCounter implements Runnable {
	private static long counter = 1;
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" enters");
		bookTickets();
		System.out.println(name+" exits");
	}
	public synchronized void bookTickets() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" trying to book the ticket");
		try {
			Thread.sleep(500);
			if(counter != 0) {
				counter--;
				System.out.println(name+" booked the ticket");
			} else {
				System.err.println(name+" sorry ticket sold out!");
			}
		} catch(Exception e) {
			System.err.println(e);
		}
	}
}
// In a separate class create a main method with 3 threads having some names, then call start and observe the output
