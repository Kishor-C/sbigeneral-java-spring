package com.sbig.viewcontroller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbig.service.I1;

public class MainMVCDemo {

	// Assuming this is a Controller
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		I1 service = (I1) context.getBean("obj2");
		
		service.save();
		
		(( ClassPathXmlApplicationContext ) context ).close();
	}

}
