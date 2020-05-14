package com.Hibernate.api;

import java.nio.file.attribute.UserPrincipal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Autowired
	Repo rp;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = this.rp.findByUserName(username).get();
		MyUserDetails ms = new MyUserDetails(user);
		
		return ms;
	}

}
