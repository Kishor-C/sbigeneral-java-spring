package com.sbig.service;

import java.util.List;

import com.sbig.beans.Employee;

public interface EmployeeService {
	public Employee storeEmployee(Employee emp);		
	public Employee fetchEmployee(int id);
	public List<Employee> fetchEmployees();
	public void deleteEmployee(int id);
	public Employee updateEmployeeSalary(int id, double salary);
}
