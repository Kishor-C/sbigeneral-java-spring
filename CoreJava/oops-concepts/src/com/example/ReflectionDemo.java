package com.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import com.example.inheritance.Employee;

public class ReflectionDemo {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName(Employee.class.getName());
			// another way is Class.forName("com.example.inheritance.Employee");
			Method[] methods = clazz.getDeclaredMethods();
			System.out.println("_______________Methods_______________");
			for(Method method : methods) {
				System.out.println("Method: "+method);
			}
			// now try out for fields and constructors
			Constructor<?>[] constructors =  clazz.getDeclaredConstructors();
			System.out.println("________________Constructors_____________");
			for(Constructor<?> constructor : constructors) {
				System.out.println(constructor);
			}
		} catch(ClassNotFoundException e) {
			System.err.println(e);
		}
	}
}
