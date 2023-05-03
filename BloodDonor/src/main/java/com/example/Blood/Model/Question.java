package com.example.Blood.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
 @Id
  private int qno;
 private String ques;
 @OneToMany(cascade = CascadeType.ALL)
 @JoinColumn
 private List<Answer> ans;
  public int getQno() {
	return qno;
}
public void setQno(int qno) {
	this.qno = qno;
}
public String getQues() {
	return ques;
}
public void setQues(String ques) {
	this.ques = ques;
}

  
 
 
public List<Answer> getAns()
{
	return ans;
}
public void setAns(List<Answer> ans)
{
	this.ans =ans;
}
 
}
