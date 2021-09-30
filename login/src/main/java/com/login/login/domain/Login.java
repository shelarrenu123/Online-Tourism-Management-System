package com.login.login.domain;

import org.springframework.stereotype.Component;

@Component
//allows spring to automatically detect our custom beans.
//denote class as a component
public class Login {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
