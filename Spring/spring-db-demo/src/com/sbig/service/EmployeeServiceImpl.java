package com.sbig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbig.beans.Employee;
import com.sbig.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	@Transactional
	public Employee storeEmployee(Employee employee) {
		int key = dao.store(employee);
		Employee e = fetchEmployeeById(key);
		return e;
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp = dao.fetchEmployee(id);
		return emp;
	}

	@Override
	public List<Employee> fetchEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Employee updateEmployeeSalary(int id, double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Employee updateEmployeeName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
