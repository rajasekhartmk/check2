package com.bankapp.model.service;

import com.bankapp.model.entities.User;

public interface UserService {
	public void addUser(User  user);
	public User findByUserName(String userName);
}
