package com.sbig.springbootsecondapp.service;

import java.util.List;

import com.sbig.springbootsecondapp.beans.Employee;

public interface EmployeeService {
	public Employee storeEmployee(Employee employee);
	public Employee fetchEmployeeById(int id);
	public List<Employee> fetchEmployees();
	public Employee updateEmployeeSalary(int id, double salary);
	public Employee updateEmployeeName(int id, String name);
	public int deleteEmployee(int id);
}
