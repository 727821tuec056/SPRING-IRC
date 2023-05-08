package com.example.Loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Loan.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
