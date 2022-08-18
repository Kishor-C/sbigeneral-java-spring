package com.sbig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreDemo {

	public static void main(String[] args) {
		Employee employee = new Employee(555, "Ravi", 84000);
		// In Hibernate all the checked exceptions are handled
		// 1. Load the Configuration 
		Configuration cfg = new Configuration();
		cfg.configure(); // this loads the hibernate.cfg.xml by default
		
		// 2. SessionFactory object that helps us to create Session
		SessionFactory factory = cfg.buildSessionFactory();
		
		// 3. Session object to perform save(), get(), delete(), update()
		Session session = factory.openSession();
		
		// 4. To modify the database we need a Transaction object
		Transaction transaction = session.beginTransaction();
		
		// 5. Perform the operation like save, update, delete
		session.save(employee);
		
		// 6. Commit the transaction
		transaction.commit();
		
		// 7. close the session and factory
		session.close();
		factory.close();
		System.out.println("____________ Object Stored ___________");
	}

}
