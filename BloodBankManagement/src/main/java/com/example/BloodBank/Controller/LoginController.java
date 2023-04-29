package com.example.BloodBank.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.BloodBank.Model.LoginModel;
import com.example.BloodBank.Service.LoginService;



@RestController

public class LoginController {
	@Autowired
	private LoginService service;
	
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> logindata)
	{
		String username=logindata.get("username");
		String password=logindata.get("password");
		String result=service.checklogin(username,password);
		return result;
	}
	
	@PostMapping("/post")
	public LoginModel adddetails(@RequestBody LoginModel id)
	{
		return service.adddetails(id);
	}
	
	
}
