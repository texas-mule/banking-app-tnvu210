package com.revature;


public class CheckingAccount extends Account {

	public CheckingAccount() {
		
	}
	@Override
	public void displayInfo(){
		System.out.println("-------------------------------");
		System.out.println("Account information");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Type: Checking Account");
		System.out.println("Balance: " + this.balance);
		
		System.out.println("-------------------------------");
	
	}

	@Override
	public void depositMoney(double deposit){
		super.depositMoney(deposit);
		System.out.println("-------------------------------");
		System.out.println("Deposit Statement");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("AccountNumber: " + this.accNumber);
		System.out.println("Deposit Amount: " + deposit);
		System.out.println("Current balance: " + this.balance);
		System.out.println("Type: Checking Account");
		System.out.println("-------------------------------");

	}

	@Override
	public void withdrawMoney(double withdraw){
		
		super.withdrawMoney(withdraw);
		System.out.println("-------------------------------");
		System.out.println("Withdraw statement");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Withdraw Amount: " + withdraw);
		System.out.println("Current balance: " + (this.balance));
		System.out.println("Type: Checking Account");
		System.out.println("-------------------------------");
			

	
	}

	@Override
	public void checkCurrentBalance(){
		System.out.println("-------------------------------");
		System.out.println("Check current balance!");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Current balance: " + this.balance);
		System.out.println("Type: Checking Account");
		System.out.println("-------------------------------");

		
	
	}

	@Override
	public void bankStatement(){
		System.out.println("-------------------------------");
		System.out.println("Bank Statement");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Current balance: " + this.balance);
		System.out.println("Type: Checking Account");
		System.out.println("-------------------------------");

		
	
	}

}
