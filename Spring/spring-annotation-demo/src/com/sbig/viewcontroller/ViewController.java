package com.sbig.viewcontroller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbig.service.EmployeeService;


public class ViewController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService)context.getBean("employeeServiceImpl");
		service.save();
		
		(( ClassPathXmlApplicationContext ) context ).close();
	}

}
