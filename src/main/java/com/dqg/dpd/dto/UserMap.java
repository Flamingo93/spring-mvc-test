package com.dqg.dpd.dto;

import com.dqg.dpd.domain.User;

import java.util.Map;

public class UserMap {
	private Map<String,User> users;

	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}
	
}
