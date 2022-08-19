package com.sbig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbig.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public void save() {
		dao.store();
		System.out.println("save() method of EmployeeServiceImpl");
	}
}
/*
 * create a Main class in viewcontroller & call save() method of service 
 */
