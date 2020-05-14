package com.Hibernate.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cont {
@Autowired
hiberservice hs;
	
	@GetMapping("/")
	public String home()
	{
		
		return "<h1>Welcome</h1>";
	}
	
	@GetMapping("/user")
	public String user()
	{
		
		return "<h1>Welcome User</h1>";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		
		return "<h1>Welcome Admin</h1>";
	}
	
	
	
	
	
}
