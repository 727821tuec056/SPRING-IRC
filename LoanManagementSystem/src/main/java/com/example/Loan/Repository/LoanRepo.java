package com.example.Loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Loan.Model.LoanApplicationModel;

public interface LoanRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
