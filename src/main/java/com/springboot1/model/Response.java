package com.springboot1.model;

public class Response {
	
	User user;
	String status;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Response [user=" + user + ", status=" + status + "]";
	}

}
