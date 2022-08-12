package com.threads;

public class R implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" Enters");
		for(int i = 1; i <= 200; i++) {
			System.out.println("i = "+i+", executing by "+t.getName());
		}
		System.out.println(t.getName()+" Exits");
	}
}
