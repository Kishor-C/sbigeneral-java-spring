package com.sbig;

import java.util.List;

public interface EmployeeService {

	// we will have 3 methods here save(Employee), fetchAll: List, fetch(int): Employee
	int save(Employee employee);

	// fetchEmployees that returns List<Employee>
	List<Employee> fetchEmployees();

	// fetch employee by id
	Employee fetchEmployee(int id);

	int update(int id, double salary);

	int delete(int id);

}