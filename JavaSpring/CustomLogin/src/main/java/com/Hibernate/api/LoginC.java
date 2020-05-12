package com.Hibernate.api;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateError;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginC {
	 private EntityManager manager;
	
private SessionFactory sessionFactory;
org.hibernate.Session session =null;
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	
	@GetMapping("/logout")
	public String logout()
	{
		return "logout";
	}
	
	
	@GetMapping("/")
	@ResponseBody
	public String sql()
	{
		

	
	model m = new model (120L,true,"aaa","ROLE_ADMIN", "AHMAAAAA");
	//Delete entity using JP QL
	org.hibernate.query.Query query = (org.hibernate.query.Query) manager.createNativeQuery("DELETE FROM user_t WHERE ID = " + 1);
	query.executeUpdate();
		
		
		return "oldu";
	}
}

