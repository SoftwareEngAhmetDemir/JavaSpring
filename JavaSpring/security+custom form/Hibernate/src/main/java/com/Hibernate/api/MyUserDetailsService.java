package com.Hibernate.api;

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
		
		Optional<User> user = rp.findByUserName(username);
		
		user.orElseThrow(()-> new UsernameNotFoundException("Not Found"));
		
		
		return user.map(MyUserDetails::new).get();
	}

}
