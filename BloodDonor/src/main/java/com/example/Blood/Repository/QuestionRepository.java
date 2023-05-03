package com.example.Blood.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blood.Model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
