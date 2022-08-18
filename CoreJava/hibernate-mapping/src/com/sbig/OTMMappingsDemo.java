package com.sbig;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OTMMappingsDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		State state = session.get(State.class, "KA");
		System.out.println("_____________ State Information __________________");
		System.out.println("State Id = "+state.getStateId()+", Name = "+state.getStateName());
		
		System.out.println("_____________ City Information ___________________");
		List<City> cities = state.getCities(); 
		cities.forEach(city -> System.out.println("City Id = "+city.getCityId()+", Name = "+city.getCityName()));
		
		session.close();
		factory.close();
	}

}
