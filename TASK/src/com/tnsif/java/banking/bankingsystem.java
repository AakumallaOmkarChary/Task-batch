package com.tnsif.java.banking;

public class bankingsystem {
	private String coustomerName ;
	private double balance;
	
	public bankingsystem(String coustomerName,double balance )
	{
		this.coustomerName =coustomerName;
		this. balance = balance;
	}
    // deposite 
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("deposite successfull");
	}
	// withdrawl
	public void withdrawl(double amount )
	{
		if(amount <= balance)
		{balance= balance-amount;
			System.out.println("Withdrawl successful!");
		}else 
			System.out.println("Insufficent balance ");
		
	}// checkbalance 
	public void checkBalance()
	{
		System.out.println("coustomerName "+ coustomerName);
		System.out.println("current balance $"+ balance);
	}
}
