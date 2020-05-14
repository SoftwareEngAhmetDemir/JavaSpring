package com.Hibernate.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycont {

	@GetMapping("/pass")
	public String pass()
	{
		return "pass.html";
	}
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
}
