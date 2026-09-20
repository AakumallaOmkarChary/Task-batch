package com.java.BankingSystem;
import java.util.Scanner;
public class Bankingmain {

	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		
		System.out.println("Enter ACCount Number  ");
		int accountNumber = b.nextInt();
		System.out.println("Enter initial balance ");
		double balance = b.nextDouble();
		BankAccount  account = new BankAccount (accountNumber,balance);
		account.displayBalance();
		
        try {
        	System.out.println("Enter the deposite amount ");
        	double depositeAmount =b.nextDouble();
        	
        	account .Deposite(depositeAmount);
        	
        }catch( InvalidAmountException e) {
        	System.out.println(e.getMessage());
        	
        }
        try {
        	System.out.println("Enter the withdraw amount : ");
        	double withdrawAmount = b.nextDouble();
        	account.withdraw(withdrawAmount);
        	}catch( InvalidAmountException e) {
        	System.out.println(e.getMessage());
        	
        }
        
        catch(InsufficientFundsException e) {
        	System.out.println(e.getMessage());
        }
        	
        	
        finally {
        	System.out.println("Banking tractions process completed ");
        	
        }
        account.displayBalance();
        b.close();
	}

}
