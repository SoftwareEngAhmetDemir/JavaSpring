package com.Hibernate.api;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRepo 
{
	@Autowired
jpaC rp;
	
	public void usave(model m)
	{
		rp.save(m);
		
		
	}
	
	
}
