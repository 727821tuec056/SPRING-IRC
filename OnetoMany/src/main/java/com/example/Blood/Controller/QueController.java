 package com.example.Blood.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Blood.Model.QueModel;
import com.example.Blood.Repository.QueRepo;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class QueController {

	
	@Autowired
	QueRepo repo;
	
	//posting the given details
	@PostMapping("/posting")
	@Tag(name="Post Data",description ="Posting the given details")
	public String adddetails(@RequestBody QueModel ques)
	{
		repo.save(ques);
		return"Saved Successfully";
	}
}
