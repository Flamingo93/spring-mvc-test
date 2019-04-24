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

    /**
     *
     * Use set as spring mvc param need init here.
     *
     */
	public UserSet(){
        users.add(new User());
        users.add(new User());
        users.add(new User());
    }

	@Override
	public String toString() {
		return "UserSet{" +
				"users=" + users +
				'}';
	}
}
