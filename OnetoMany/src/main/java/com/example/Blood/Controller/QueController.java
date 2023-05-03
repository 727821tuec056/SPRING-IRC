 package com.example.Blood.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Blood.Model.QueModel;
import com.example.Blood.Repository.QueRepo;

@RestController
public class QueController {

	
	@Autowired
	QueRepo repo;
	
	//posting the given details
	@PostMapping("/posting")
	public String adddetails(@RequestBody QueModel ques)
	{
		repo.save(ques);
		return"Saved Successfully";
	}
}
