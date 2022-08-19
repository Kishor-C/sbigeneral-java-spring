package com.sbig.service;

import com.sbig.dao.I2;
// Assuming it is a Service 
public class B implements I1 {
	
	private I2 dao; // we need this reference to call DAO code

	public I2 getDao() {
		return dao;
	}

	public void setDao(I2 dao) {
		this.dao = dao;
	}
	
	@Override
	public void save() { // this method must call DAO method
		dao.store();
		System.out.println("__________ save() implemented in B __________");
	}

	
}
