package com.revature;



public class SavingAccount extends Account {
	
	public SavingAccount() {
		
	}
	@Override
	public void depositMoney(double deposit){
		
		super.depositMoney(deposit);
		System.out.println("-------------------------------");
		System.out.println("Deposit statement");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Deposit Amount: " + deposit);
		System.out.println("Balance: " + this.balance);
		System.out.println("Type: Saving Account");
		System.out.println("-------------------------------");

	}

	@Override
	public void withdrawMoney(double withdraw){
		super.withdrawMoney(withdraw);
		System.out.println("-------------------------------");
		System.out.println("Withdraw statement");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Withdraw Amount: " + -withdraw);
		System.out.println("Balance: " + this.balance);
		System.out.println("Type: Saving Account");
		System.out.println("-------------------------------");
		


	
	}

	@Override
	public void checkCurrentBalance(){
		System.out.println("-------------------------------");
		System.out.println("Check current balance!");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Balance: " + this.balance);
		System.out.println("Type: Saving Account");
		System.out.println("-------------------------------");
	
	}

	@Override
	public void bankStatement(){
		System.out.println("-------------------------------");
		System.out.println("Bank monthly statement");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Current balance: " + this.balance);
		System.out.println("Type: Saving Account");
		System.out.println("-------------------------------");
		
	
	}
	

	@Override
	public void displayInfo(){
		System.out.println("-------------------------------");
		System.out.println("Account information");
		System.out.println("Account Name: " + this.Lname + ", " + this.Fname);
		System.out.println("Account Number: " + this.accNumber);
		System.out.println("Type: Saving Account");
		System.out.println("Balance: " + (this.balance ));
		System.out.println("-------------------------------");
	}
}
