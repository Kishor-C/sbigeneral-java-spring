package com.example.abstraction;
// If you implement an interface in a class then you must implement all the methods else make class abstract
// since Bike class doesn't implement mileage we need to make it abstract
abstract class Bike implements Vehicle {
	@Override
	public int wheels() {
		return 2;
	}	
}
// KTM class can just extend Bike
class KTM extends Bike {
	public double mileage() {
		return 35;
	}
}
// RE class can just extend Bike
class RE extends Bike {
	public double mileage() {
		return 30;
	}
}
// use this class for main method
public class AbstractionDemo {
	public static void main(String[] args) {
		KTM ktm = new KTM();
		demo(ktm);
		RE re = new RE();
		demo(re);
	}
	public static void demo(Vehicle v) {
		System.out.println("Wheels: "+v.wheels());
		System.out.println("Mileage: "+v.mileage());
		System.out.println("-------------------------");
	}
}
