package com.sbig.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sbig.beans.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> list = new ArrayList<Employee>();

	@Override
	public Employee storeEmployee(Employee emp) {
		list.add(emp);
		return emp;
	}

	@Override
	public Employee fetchEmployee(int id) {
		for(Employee e : list) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public List<Employee> fetchEmployees() {
		return list;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee updateEmployeeSalary(int id, double salary) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
