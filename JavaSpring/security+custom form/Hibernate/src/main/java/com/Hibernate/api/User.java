package com.Hibernate.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_t")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pass;
	private String userName;
	private String roles;
	private boolean active;
	public int getId() {
		return id;
	}
	
	
	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	

	
}
