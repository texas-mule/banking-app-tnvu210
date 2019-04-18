package com.revature;

public class Admin extends Employee {

	private String username, password;
	private boolean isAdmin = true;
	public boolean isAdmin() { 
		super.isAdmin = this.isAdmin;
		return super.isAdmin(); 
	}
	public Admin() { 
		super();
		employeeID = -1;
	}
	public Admin(String username, String password) {
		super(username, password);
		this.setUsername(username);
		this.setPassword(password);
		super.isAdmin = true;		
	}
	
	public Admin(String username, String password, boolean isAdmin) {
		super(username, password, true);
		this.username = username;
		this.password = password;
	}
	
	public void getInfo() {
		System.out.println("EmployeeID: " + this.employeeID);
		if (username != null) 
			System.out.println("Username: " + username);
		if (password != null) 
			System.out.println("Password: " + password);
		if (this.isAdmin) 
			System.out.println("isAdmin?: " + Boolean.toString(this.isAdmin));
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

}
