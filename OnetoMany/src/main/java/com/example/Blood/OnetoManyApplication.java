package com.example.Blood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		 info =@Info(
		 title = "OnetoMany",
		version = "1.1.2",
		description = "Tables",
		 contact = @Contact(
		name = "Janani",
	  email = "jananilakshmi07@gmail.com"
		 )
		 )
		)
public class OnetoManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetoManyApplication.class, args);
	}

}
