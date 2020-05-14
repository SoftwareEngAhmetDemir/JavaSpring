package com.Hibernate.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails
{
	private String username;
	private String pass;
	private boolean active;
	private List<GrantedAuthority> auth = new ArrayList<>();
	
	
	public  MyUserDetails(User username)
	{
		this.username = username.getUserName();
		
		this.pass = username.getPass();
		this.active = username.isActive();

	
		GrantedAuthority smp = new SimpleGrantedAuthority(username.getRoles());
		this.auth.add(smp);
		
		
	}
	public  MyUserDetails()
	{
		
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		
		return auth;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return pass;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return active;
	}

}
