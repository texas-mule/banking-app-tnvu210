/**
 * 
 */
package com.revature.employee;

/**
 * @author Thanh Vu
 *
 */
public class Employee {

	private String username, password;
	protected boolean isAdmin = false;
	protected int employeeID;
	public Employee() { 
		employeeID = -1;
	}
	public Employee(String username, String password) {
		this.username = username;
		this.password = password;
		
	}
	public Employee(String username, String password, boolean isAdmin) {
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
		
	}

	public void getInfo() {
		System.out.println("EmployeeID: " + this.employeeID);
		if (username != null) 
			System.out.println("Username: " + username);
		if (password != null) 
			System.out.println("Password: " + password);
		if (isAdmin) 
			System.out.println("isAdmin: " + Boolean.toString(isAdmin));
	}
	
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	public void setEmployeeID(int id) {
		this.employeeID = id;
	}
	

	
	public String getUsername() {
		return this.username; }
	
	public String getPassword() { 
		return this.password; }
	
	public boolean isAdmin() { 
		return this.isAdmin; }
	
}

