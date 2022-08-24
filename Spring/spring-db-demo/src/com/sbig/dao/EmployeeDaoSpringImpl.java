package com.sbig.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sbig.beans.Employee;

@Repository
public class EmployeeDaoSpringImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate template; // DriverManagerDataSource -> LocalSessionFactoryBean -> HibernateTemplate

	@Override
	public int store(Employee employee) {
		int key = (int) template.save(employee);
		return key;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee fetchEmployee(int id) {
		Employee emp = template.get(Employee.class, id);
		return emp;
	}
	
	
}
