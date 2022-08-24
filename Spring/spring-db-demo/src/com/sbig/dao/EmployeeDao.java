package com.sbig.dao;

import java.util.List;

import com.sbig.beans.Employee;

public interface EmployeeDao {
	public int store(Employee employee);
	public List<Employee> getEmployees();
	public void update(Employee emp);
	public void delete(Employee emp);
	public Employee fetchEmployee(int id);
}
