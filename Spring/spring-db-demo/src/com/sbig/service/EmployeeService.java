package com.sbig.service;

import java.util.List;

import com.sbig.beans.Employee;

public interface EmployeeService {
	public Employee storeEmployee(Employee employee);
	public Employee fetchEmployeeById(int id);
	public List<Employee> fetchEmployees();
	public Employee updateEmployeeSalary(int id, double salary);
	public Employee updateEmployeeName(int id, String name);
	public void deleteEmployee(int id);
}
