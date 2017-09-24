package com.hm1.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Login {
	
	private String username;
	private String password;
	private String lastname;
	private String firstname; 
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	String addres;
	private String email;
	private String phonenumber;
	String s="";

	
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
	
	public String login()
	{
		if(this.username.equals("Admin")&& this.password.equals("Admin"))
		{
			
			return "sucess";
		}
		else if(this.username.equals(null)&& this.password.equals(null))
		{
			return "Registration";
		}
		else
		{
			
			return "failure";
		}
		
	}
	
	public String registration(){
		
		if(this.email.contains("@") && this.phonenumber.length()==10 && this.email.contains(".com")&& this.phonenumber.contains("*[0-9]"))
		{
			
			return "regsuc";
		}
		else
			return "Wrong details entered";
		
			
	}

}
