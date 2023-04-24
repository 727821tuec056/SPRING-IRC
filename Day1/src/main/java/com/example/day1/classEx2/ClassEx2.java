package com.example.day1.classEx2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassEx2 {
	public String name="Iamneo";
	@GetMapping("/setname")
	public String getName()
	{
		return "welcome "+name;
	}

}
