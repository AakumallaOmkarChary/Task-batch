package com.java.constructor;
import java.util.Scanner;
class father {
	 Scanner sc = new Scanner(System.in);
	father(){
		 this (23);
				System.out.print("Enter your son  name: "); 
    	String name = sc.nextLine();
		
		System.out.print ("enter your daughter name :");
		String  daughter =sc.nextLine();
		
		
	}father( int age){
		System.out.println("Enter your age ");
		System.out.println("your age is "+ age);
		
	}
	
	
	public static void main(String[] args) {
		father obj = new father ();
	}

}
