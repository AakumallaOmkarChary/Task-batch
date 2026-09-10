package com.java.Employeepromotion;

import java.util.Scanner;
	
		
		class Employee{
			private String name;
			private int employeeId;
			
			public void setName(String name)
			{
				this .name = name;
			}
			public void setemployeeId(int employeeId)
			{
				this.employeeId = employeeId;
			}
			public void displayEmployeeDetails() {
				System.out.println("employee name :"+name);
				System.out.println("EmployeeId :"+employeeId);
				
			}
		}
			class Developer extends Employee{
				private String programminglanguage;
			
			public void setprogramminglanguage(String programminglanguage ) {
				this.programminglanguage = programminglanguage;
			}
			public void displayDeveloperdetails() {
				System.out.println("programminglanguage "+ programminglanguage);
			}
			}
			class SeniorDeveloper extends Developer{
				private int experience ;
				public void setexperience(int experience) {
					this.experience = experience;
				}
				public void  displaySeniorDetails() {
					System.out.println("experience "+ experience +"years");
				}
				
			}
			
		
	

	

public class Demo{
	
public static void main( String args []) {
	Scanner sc = new Scanner(System.in);
	SeniorDeveloper s = new SeniorDeveloper();
	System.out.print("Enter yuur name :");
	String name = sc.nextLine();
	
	System.out.println("Enter your EmployeeId : ");
	int employeeId = sc.nextInt();
	
	
	System.out.print("Enter your programming language :");
	String programminglanguage = sc.nextLine();
	sc.nextLine();
	System.out.println("Year of experiencr :");
	int experience = sc.nextInt();
	
	s.setName(name);
	s.setemployeeId(employeeId);
	s.setprogramminglanguage(programminglanguage);
    s.setexperience(experience );
    
    System.out.println("\n all details ");
    s.displayEmployeeDetails();
    s.displayDeveloperdetails();
    s. displaySeniorDetails();   
}
}
