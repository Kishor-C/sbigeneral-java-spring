package com.example.abstraction;

// Vehicle is an interface it cannot have any implementation

/*
 * Interface members are by default public
 * Interface variables are by default public static final
 * Interface methods are by default public abstract
 * Interface will not have any constructor not even default constructor
 * You can't create object out of interface i.e., Vehicle v = new Vehicle() is an error!
 */
public interface Vehicle {
	// by default methods are public & abstract in interface
	public int wheels(); // this is compiled to public abstract int wheels();
	public double mileage(); // this is compiled to public abstract double milage();
}
