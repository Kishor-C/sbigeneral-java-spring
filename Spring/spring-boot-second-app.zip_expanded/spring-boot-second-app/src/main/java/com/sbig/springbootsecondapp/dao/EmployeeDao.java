package com.sbig.springbootsecondapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbig.springbootsecondapp.beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	// you can create your own methods which is also auto-implemented using the @Query
	// annotation
	/*
	 * @Query("select e from Employee e where e.name = ?1")
	 * public List<Employee> findEmployeesByName(String name);
	 * 
	 */
}
