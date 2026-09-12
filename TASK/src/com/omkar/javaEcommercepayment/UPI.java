package com.omkar.javaEcommercepayment;

public class UPI  implements payment{
public void pay(double amount) {
	System.out.println("payment of ₹ "+ amount +" made using UPI");
}
}
