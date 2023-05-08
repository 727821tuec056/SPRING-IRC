package com.example.Loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Loan.Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {
	

}
