package com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		try {
			Employee emp = new Employee(1234, "Sachin", 45000);
			
			FileOutputStream fos = new FileOutputStream("employees.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp); // writes the object to the file
			
			oos.flush();
			oos.close();
			fos.close();
			System.out.println("Object is serialized!");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
