package com.example.BloodBank.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bloodd")
public class LoginModel {
	@Id
	
	//Login
		private int userid;
	private String username;
    private String password;
    private String dname;
    private int dage;
    private String dgender;
    private String demail;
    private String dgroup;
    private String dphoneno;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDage() {
		return dage;
	}
	public void setDage(int dage) {
		this.dage = dage;
	}
	public String getDgender() {
		return dgender;
	}
	public void setDgender(String dgender) {
		this.dgender = dgender;
	}
	public String getDemail() {
		return demail;
	}
	public void setDemail(String demail) {
		this.demail = demail;
	}
	public String getDgroup() {
		return dgroup;
	}
	public void setDgroup(String dgroup) {
		this.dgroup = dgroup;
	}
	public String getDphoneno() {
		return dphoneno;
	}
	public void setDphoneno(String dphoneno) {
		this.dphoneno = dphoneno;
	}
	
	   
        
       
      }
		
