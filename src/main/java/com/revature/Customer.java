package com.revature;

import java.util.ArrayList;
public class Customer {

	private static ArrayList<Integer> openIDs = null;
	
	
	private String username, password;
	private String fName, lName;
	private String phone, email;
	private boolean joint = false;
	
	
	public Customer(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Customer(String username, String password, String fName, String lName, String phone, String email) {
		this.username = username;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.phone = phone;
		this.email = email;
			
	}
	
	
	public String getUsername() {
		return this.username; }
	
	public String getPassword() {
		return this.password; }
	
	public String getFirstname() { 
		return this.fName; }
	
	public String getLastname() {
		return this.lName; }
	
	public String getPhone()   { 
		return this.phone; }
	
	public String getEmail()   {
		return this.email; }
	
	
}

