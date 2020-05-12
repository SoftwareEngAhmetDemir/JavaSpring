package com.Hibernate.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_t")
public class model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	
	
	
	
	public model(Long id, boolean active, String pass, String roles, String user_name) {
		
		super();
		this.id = id;
		this.active = active;
		this.pass = pass;
		this.roles = roles;
		this.user_name = user_name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	private boolean active;
	private String pass;
	private String roles;
	private String user_name;
}
