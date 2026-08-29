package com.tnsif.java.banking;
import java.util.Scanner;
public class bank {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		bankingsystem account = new bankingsystem("omkar",5000);
		int choice;
		do {
		System.out.println("BANKING SYSTEM");
		System.out.println("1. Deposite");
		System.out.println("2. withdraw");
		System.out.println("3. check Balance");
		System.out.println("4. Exit ");
		System.out.println("Enter your choice");
		
		 choice = sc.nextInt();
		
		if(choice ==1)
		{
			System.out.println("Enter deposite amount: ");
			double amount =sc.nextDouble();
			account.deposit(amount);
		}else if (choice == 2)
		{
			System.out.println("Enter withdraw amount");
			double amount = sc.nextDouble();
			account.withdrawl(amount);
		}else if(choice == 3)
		{
			account.checkBalance();
		}else if (choice ==4)
		{
			System.out.println("Thankyou for using our services ");
		}else 
		{
			System.out.println("Invilid choice!");
		}
		} while(choice !=4);
		sc.close();
		
	}

}
 