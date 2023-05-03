package com.example.Blood.Controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Blood.Model.Question;
import com.example.Blood.Repository.QuestionRepository;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionRepository qrepo;
	@PostMapping
	public String javaDetails(@RequestBody Question ques)
	{
		 qrepo.save(ques);
		 return "Data is saved";
	}
	
}
