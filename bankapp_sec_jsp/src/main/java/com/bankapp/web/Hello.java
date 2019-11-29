package com.bankapp.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bankapp.config.SecUser;
import com.bankapp.model.entities.User;

@Controller
public class Hello {
	
	@GetMapping(path="accessdenied")
	public String accessdenied(){
		return "403";
	}
	
	@GetMapping(path="login")
	public String login(){
		return "loginpage";
	}
	
	@GetMapping(path="/")
	public String welcome(){
		
		 return "redirect:/home";
	}
	
	@GetMapping(path="home")
	public String home(@AuthenticationPrincipal SecUser user){
		System.out.println(user.getUser());
		return "home";
	}
	
	@GetMapping(path="clerk")
	public String helloClerk(@AuthenticationPrincipal SecUser user){
		System.out.println(user);
		return "clerk_home";
	}
	
	@GetMapping(path="mgr")
	public String helloMgr(){
		return "mgr_home";
	}
	@GetMapping(path="admin")
	public String helloAdmin(){
		return "admin_home";
	}
	
}
