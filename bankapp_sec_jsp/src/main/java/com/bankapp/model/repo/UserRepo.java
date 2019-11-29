package com.bankapp.model.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entities.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{
	public User findByUserName(String userName);
}
