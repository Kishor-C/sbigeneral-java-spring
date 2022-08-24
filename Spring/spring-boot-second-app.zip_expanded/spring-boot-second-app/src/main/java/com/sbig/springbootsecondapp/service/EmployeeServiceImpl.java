package com.sbig.springbootsecondapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbig.springbootsecondapp.beans.Employee;
import com.sbig.springbootsecondapp.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	/*Methods that perform updates should be annotated with @Transaction*/
	
	@Override
	@Transactional
	public Employee storeEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		// returns employee or null
		return dao.findById(id).orElse(null);
	}

	@Override
	public List<Employee> fetchEmployees() {
		return dao.findAll();
	}

	@Override
	public Employee updateEmployeeSalary(int id, double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployeeName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub	
		return 0;
	}
		
}
