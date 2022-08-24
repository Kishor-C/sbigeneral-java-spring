package com.sbig.springbootsecondapp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbig.springbootsecondapp.beans.Employee;
import com.sbig.springbootsecondapp.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/employee")
	public ResponseEntity<Object> fetchAllEmployees() {
		List<Employee> list = service.fetchEmployees();
		return ResponseEntity.status(200).body(list);
	}
	@PostMapping(path = "/employee")
	public ResponseEntity<Object> store(@RequestBody Employee emp) {
		Employee e = service.storeEmployee(emp);
		return ResponseEntity.status(200).body(e);
	}
	@GetMapping(path = "/employee/{id}")
	public ResponseEntity<Object> fetch(@PathVariable("id") int id) {
		Employee e = service.fetchEmployeeById(id);
		if(e != null) {
			return ResponseEntity.status(200).body(e);
		} else {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("message", "Sorry "+id+" not found");
			return ResponseEntity.status(404).body(map);
		}
	}
	
}
