package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component


public class User {
	
	@Id
	private String id;
	
	private String name;
	
	private String password;
	
	private String mobile;
	
	
	private String role;

	public String getId() {
	 return id;
	 
	}

	public void setid(String id) {
		this.id = id;
	}


	public String getname() {
		 return name;
		}
	

	public void setname(String name) {
		this.name = name;
	}

	
	public String getpassword() {
		 return password;
		}
	

	public void setpassword(String password) {
		this.password= password;
	}

	
	
	public String getmobile() {
		 return mobile;
		}
	

	public void setmobile(String mobile) {
		this.mobile= mobile;
	}

	
	
	public String getrole() {
		 return role;
		}
	

	public void setrole(String role) {
		this.role= role;
	}

	
	
	
	
	
	
	

}
