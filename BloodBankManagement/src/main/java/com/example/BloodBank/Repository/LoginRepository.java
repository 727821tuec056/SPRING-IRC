package com.example.BloodBank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BloodBank.Model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Integer> {
	
	LoginModel findByUsername(String Username);

}
