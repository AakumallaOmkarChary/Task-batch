package com.omkar.assignment.employees;

public class Developer extends Employee {
	private String programminglanguage ;
	
	public Developer(String name,int employeeId,double salary,String programminglanguage)
	{
		super(name,employeeId,salary);
		this.programminglanguage = programminglanguage;
	}
 // getter 
	public String getprogramminglanguage()
	{
		return programminglanguage;
	}
	// setter 
	public void setprogramminglanguage(String programminglanguage)
	{
		this. programminglanguage = programminglanguage;
	}
	// display method 
	public void displayDeveloperInfo()
	{
		displayBasicInfo();
		System.out.println("programminglanguage :" + programminglanguage);
		
	}
}
