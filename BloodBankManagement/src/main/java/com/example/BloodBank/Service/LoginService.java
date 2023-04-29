package com.example.BloodBank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BloodBank.Model.LoginModel;
import com.example.BloodBank.Repository.LoginRepository;

@Service
public class LoginService {

	
	@Autowired
	private LoginRepository repo;
	public String checklogin(String username, String password) {
		// TODO Auto-generated method stub
		LoginModel user=repo.findByUsername(username);
		if(user==null)
		{
			return"No user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return"Login Successfull";
			}
			else
			{
				return"Login failed";
			}
		}
	}

	public LoginModel adddetails(LoginModel id) {
		// TODO Auto-generated method stub
		return repo.save(id);
	}
	

	

	
	

}
