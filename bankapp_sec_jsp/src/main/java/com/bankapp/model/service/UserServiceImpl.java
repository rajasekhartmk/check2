package com.bankapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.User;
import com.bankapp.model.repo.UserRepo;
@Transactional
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public User findByUserName(String userName) {
		return userRepo.findByUserName(userName);
	}

}
