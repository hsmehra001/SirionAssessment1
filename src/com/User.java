package com;

import java.util.HashMap;
import java.util.Map;

public class User implements IValidate {
	private String userId;
	private String password;
	public static Map<String, String> users=new HashMap<String, String>();
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public boolean isAuthenticated(String userId, String password) {
		if(users.get(userId).equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	void addUser(String userId,String password) {
		if(users.containsKey(userId)) {
			System.out.println("User Already Exists");
		}
		else {
			users.put(userId, password);
		}
	}
}
