package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.model.entities.User;
import com.bankapp.model.service.UserService;

@SpringBootApplication
public class BankappSecApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(BankappSecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		userService.addUser(new User("raj", "raj", new String[]
//				{"ROLE_ADMIN","ROLE_MGR","ROLE_CLERK"}, "r@r.com", true));
//		userService.addUser(new User("ekta", "ekta", new String[]
//				{"ROLE_MGR","ROLE_CLERK"}, "e@r.com", true));
//		userService.addUser(new User("gunika", "gunika", new String[]
//				{"ROLE_CLERK"}, "g@r.com", true));
	}

}
