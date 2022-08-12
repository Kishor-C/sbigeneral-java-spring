package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("employees.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject(); // returns the Object
			Employee emp = (Employee) obj; // downcast to Employee as readObject always return Object
			
			System.out.println(emp);
			ois.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}

}
