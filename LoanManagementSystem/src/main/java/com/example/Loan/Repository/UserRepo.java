package com.example.Loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Loan.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
