package com.Hibernate.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import ch.qos.logback.core.pattern.color.BoldYellowCompositeConverter;
@Configuration
@EnableWebSecurity
public class Sec extends WebSecurityConfigurerAdapter 
{
	@Autowired
	UserDetailsService us;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(us);
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user/**").hasAnyRole("ADMIN","USER") // User and Admin who has role can access to user/anythingRout
		.antMatchers("/").permitAll()
		.and().formLogin().loginPage("/login"). // go to  login.html page after you enter the site 
		and().logout().
		logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login");// when you logout go to login page
	}
	
	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	
//	@Bean 
//	public PasswordEncoder getPasswordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
//	
	
	
	
}
