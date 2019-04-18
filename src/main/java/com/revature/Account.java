/**
 * 
 */
package com.revature;

/**
 * @author Thanh Vu
 *
 */
public abstract class Account {

	protected String Lname;
	protected String Fname;
	protected String accNumber, routingNumber;
	protected String accType;
	protected double balance;
	
	
	public String getRoutingNumber() {
		return routingNumber;
	}
	
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	
	public String getName() {
		return Lname + "' " + Lname;
	}
	public void setName(String Lname, String Fname) {
		this.Lname = Lname;
		this.Fname = Fname;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayInfo(){
		
	
	}

	public void depositMoney(double deposit){
		this.balance += deposit;
	
	}
	public void withdrawMoney(double withdraw){
		this.balance -= withdraw;
	
	}
	
	public void transferMoney(String fromAccount, String toAccount, double amount ) {
		this.accType = fromAccount ;
		this.accType = toAccount;
		this.balance = amount;
		
	}
	public void checkCurrentBalance(){
		
	
	}
	public void bankStatement(){
		
	
	}

}
