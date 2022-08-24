package com.sbig.springbootsecondapp.aspects;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Tracker {

	@Before("execution(* com.sbig.springbootsecondapp.service.EmployeeServiceImpl.storeEmployee(..))")
	public void m1() {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("________________m1() executed________________::"+dateTime);
	}
	// use @After for fetchAllEmployees
}
