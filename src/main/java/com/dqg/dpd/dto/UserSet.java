package com.dqg.dpd.dto;

import com.dqg.dpd.domain.User;

import java.util.HashSet;
import java.util.Set;

public class UserSet {
	private Set<User> users = new HashSet<User>();

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public UserSet(){  
        users.add(new User());  
        users.add(new User());  
        users.add(new User());  
    }
}
