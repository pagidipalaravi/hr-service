package com.host.domain.hrservice.dto;

public class UserDto {

	private String username;
	private String password;
	
	UserDto(){
		
	}
	UserDto(String username){
		
	}
	UserDto(String username, String password){
		
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
}