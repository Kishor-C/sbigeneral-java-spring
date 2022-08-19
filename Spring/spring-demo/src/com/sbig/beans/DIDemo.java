package com.sbig.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIDemo {
	public static void main(String[] args) {
//		X x1 = new A();
//		x1.m1();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		X x1 = (X)context.getBean("x1");// returns the instance that implements X
		x1.m1();
		
		// closing context resource
		//ClassPathXmlApplicationContext cpx = (ClassPathXmlApplicationContext)context;
		//cpx.close();
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
