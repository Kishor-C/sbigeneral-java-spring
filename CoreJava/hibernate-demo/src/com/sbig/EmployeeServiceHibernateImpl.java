package com.sbig;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmployeeServiceHibernateImpl implements EmployeeService {

	@Override
	public int save(Employee employee) {
		SessionFactory factory = HibernateUtil.createSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// save() method returns the stored primary key
		int status = (int) session.save(employee);
		transaction.commit();
		session.close();
		factory.close();
		return status;
	}

	@Override
	public List<Employee> fetchEmployees() {
		SessionFactory factory = HibernateUtil.createSessionFactory();
		Session session = factory.openSession();
		
		// import 'Query' from org.hibernate.query.Query else you would get strike on Query
		Query<Employee> query = session.createQuery("select e from Employee e", Employee.class);
		
		List<Employee> list = query.getResultList();
		session.close();
		factory.close();
		return list;
	}

	@Override
	public Employee fetchEmployee(int id) {
		SessionFactory factory = HibernateUtil.createSessionFactory();
		Session session = factory.openSession();
		// retrieves the record and maps to Employee object based on the primary id
		// returns entity if primary key is found else returns null
		Employee employee = session.get(Employee.class, id);
		session.close();
		factory.close();
		return employee;
	}

	@Override
	public int update(int id, double salary) {
		int status = -1;
		SessionFactory factory = HibernateUtil.createSessionFactory();
		Session session = factory.openSession();
		Employee employee = session.get(Employee.class, id);
		if(employee == null) {
			status = -1;
		} else {
			employee.setSalary(salary);
			Transaction transaction = session.beginTransaction();
			session.update(employee);
			transaction.commit();
			status = 1;
		}
		session.close();
		factory.close();
		return status;
	}
	// implement the delete
	@Override
	public int delete(int id) {
		int status = 0;
		SessionFactory factory = HibernateUtil.createSessionFactory();
		Session session = factory.openSession();
		Employee employee = session.get(Employee.class, id);
		if(employee == null) {
			status = -1;
		} else {
			Transaction transaction = session.beginTransaction();
			session.delete(employee);
			transaction.commit();
			status = 1;
		}
		session.close();
		factory.close();
		return status;
	}

}
