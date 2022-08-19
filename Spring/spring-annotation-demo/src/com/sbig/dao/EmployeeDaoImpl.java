package com.sbig.dao;

import org.springframework.stereotype.Repository;

// @Repository creates the object automatically and its id will be same as
// class name but starts with lowercase i.e., employeeDaoImpl

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void store() {
		System.out.println("store() inside EmployeeDaoImpl");
	}

}
