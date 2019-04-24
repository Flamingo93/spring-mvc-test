package com.dqg.dpd.dto;

import com.dqg.dpd.domain.User;

import java.util.List;

public class UserList {
	private List<User.UserNode> users;

//	public UserList() {
//	}
//
//	public UserList(List<User.UserNode> users) {
//		this.users = users;
//	}

	public List<User.UserNode> getUsers() {
		return users;
	}

	public void setUsers(List<User.UserNode> users) {
		this.users = users;
	}
}
