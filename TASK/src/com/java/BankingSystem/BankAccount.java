package com.java.BankingSystem;
// initilize the bank account with account num and initial bakance 
public class BankAccount {
private int accountNumber ;
private double balance ;
//parameter constructor 
public BankAccount(int accountNumber,double balance ) {
	this.accountNumber=accountNumber;
	this.balance = balance ;
}

// deposite the money into the account after validating the amount 
public void Deposite(double amount )throws  InvalidAmountException{
	if (amount <= 0) {
		throw new  InvalidAmountException(
				"Invilid amount .Deposite amount must be greater than Zero.");
	}
	
	
	balance = balance + amount;
	System.out.println("Amount deposited successfully");
	System.out.println("current balance " + balance );
}	

// withdraws money after checking the amount and available balance 
public void withdraw(double amount)throws InvalidAmountException,InsufficientFundsException{
	 if(amount <=0) {
		 throw new InvalidAmountException(
					"Invilid amount .Deposite amount must be greater than Zero.");
	 } if (amount >balance ) {
		 throw new InsufficientFundsException("Insufficent funds .cannot withdrwal the requested amount "); 
	 }
	  
	 
	balance = balance - amount ;
	System.out.println("Amount withdrawl successfully");
	System.out.println("current balance "+ balance);
}
// displayb the account num and the current balance
public void displayBalance() {
	System.out.println("Account Number :"+ accountNumber);
	System.out.println("current Balance: "+ balance);
	
}
}