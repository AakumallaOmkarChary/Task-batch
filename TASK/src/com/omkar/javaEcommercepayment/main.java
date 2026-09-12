package com.omkar.javaEcommercepayment;
import java.util.Scanner;
public class main {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ecommers payment system");
		System.out.println("Enter the product name: ");
		String product = sc.nextLine();
		
		System.out.println("Enter the product price:");
		double amount = sc.nextDouble();
		
		System.out.println("select the payment mathods ");
		System.out.println("1.UPI");
		System.out.println("2.creditcard ");
		System.out.println("3.Debitcard");
		System.out.println("4. cashondelivery");
		
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();
		payment payment;
		switch(choice) {
		case 1:
			payment = new UPI();
			break;
		case 2:
			payment =new creaditcard();
			break;
		case 3:
			payment = new Debitcard();
			break;
		case 4:
			payment = new cashonDelivery();
			break;
			default:
				System.out.println("invilid choice");
				sc.close();
				return;
		}
		System.out.println("\n products " + product);
		System.out.println("Amount: ₹ " + amount );
		payment .pay(amount);
		
		System.out.println("order placed successfully");
		sc.close();
	}

}
