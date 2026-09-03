package com.java.constructor;

public class parent {
	
	int age =23;
	void display()
	{
		System.out.println("This is super class ");
	
	}
}
	
	class child extends parent{
		int age = 28;
		
	void show (){
		System.out.println("child age "+age);
		System.out.println("parent age "+ super.age);
	super.display();
	}
	

	}
	


