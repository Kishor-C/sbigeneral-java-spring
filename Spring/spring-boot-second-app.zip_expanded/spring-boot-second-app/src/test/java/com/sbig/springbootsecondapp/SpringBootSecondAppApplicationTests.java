package com.sbig.springbootsecondapp;


import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.sbig.springbootsecondapp.beans.Employee;
import com.sbig.springbootsecondapp.controller.EmployeeController;
import com.sbig.springbootsecondapp.service.EmployeeService;
@WebMvcTest(value = EmployeeController.class)
class SpringBootSecondAppApplicationTests {
	@Autowired
	private MockMvc mvc;
	@MockBean
	private EmployeeService service;
	@Test
	public void testEmployeeFoundPositive() {
		String url = "/api/employee/555";
		try {
			Employee emp = new Employee();
			BDDMockito.given(service.fetchEmployeeById(555)).willReturn(emp);
			mvc.perform(MockMvcRequestBuilders.get(url)).andExpect(MockMvcResultMatchers.status().isOk());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
