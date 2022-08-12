package com.threads;

public class Counter implements Runnable {

	@Override
	public synchronized void run() {
		try {
			// Get the name of the thread
			String name = Thread.currentThread().getName();
			System.out.println("_______ "+name+" Enters _______");
			for(int i = 1; i <= 10; i++) {
				System.out.println(name+" is iterating i = "+i);
				Thread.sleep(100); // doesn't release the lock
				if( (i == 5) && name.equals("A")) {
					wait(); // releases the lock so that other threads get the lock
				}
				if( (i == 8) && name.equals("C") ) {
					notifyAll(); // all the threads comes to Runnable state
				}
			}
			System.out.println("_______ "+name+" Exits _______");
		} catch(Exception e) {
			System.err.println(e);
		}
	}
}
/*
 * Create 3 threads with names A, B & C in a main method in a separate class & start all the threads
 */
