package com.sbig.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbig.beans.Employee;
import com.sbig.service.EmployeeService;

@RestController
@RequestMapping("/api")   // http://localhost:9091/api		
public class HelloController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path= "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody Employee employee) {
		Employee emp = service.storeEmployee(employee);
		return ResponseEntity.status(200).body(emp);
	}
	@GetMapping(path = "/employee")
	public ResponseEntity<Object> fetchEmployees() {
		List<Employee> list = service.fetchEmployees();
		return ResponseEntity.status(200).body(list);
	}
	@GetMapping(path = "/employee/{id}")
	public ResponseEntity<Object> fetchEmployee(@PathVariable("id") int id) {
		Employee emp = service.fetchEmployee(id);
		if(emp != null) {
			return ResponseEntity.status(200).body(emp);
		} else {
			Map<String, String> map = new HashMap<String, String>();
			map.put("error", "Sorry Employee with an id "+id+" not found!");
			return ResponseEntity.status(200).body(map);
		}
	}
}

