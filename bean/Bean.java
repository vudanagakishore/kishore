package com.bean;

public class Bean 
{
	String username;
	String password;
	

	public Bean(String username2, String password2) {
		username  = username2;
		password  = password2; 
	}
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
	@Override
	public String toString() {
		return "username=" + username + ", password=" + password ;
	}
	

	
}
