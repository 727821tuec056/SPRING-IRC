package com.example.BloodBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		 info =@Info(
		 title = "BloodBankManagement",
		version = "1.1.2",
		description = "DonorDetails",
		 contact = @Contact(
		name = "Janani",
	  email = "jananilakshmi07@gmail.com"
		 )
		 )
		)
public class BloodBankManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodBankManagementApplication.class, args);
	}

}
