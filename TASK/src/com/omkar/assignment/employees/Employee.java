package com.omkar.assignment.employees;

public class Employee {
		 // private attributes 
	private String name;
	private int employeeId;
	private double salary ;
	// constructors 
	public Employee(String name ,int employeeId, double salary)
	{
		this. name = name;
		this .employeeId = employeeId;
		this .salary = salary;
	}
	
	// getter from name 
	public String getName()
	{
		return name;
	}
	// setter for name 
	public void setName(String name )
	{
		this.name = name ;
	}
	// get for empid
	public int getEmployeeId()
	{
		return employeeId;
	}
	//setter
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
		
	}
	// get sallary 
	public double getSalary()
	{
		return salary;
	}
	// setter
	public void setSalary(double salary)
	{
		this .salary = salary;
		
	}
	// pritected method 
	protected void displayBasicInfo()
	{
		System.out.println("Name :"+ name);
		System.out.println("employeeId" + employeeId );
		System.out.println("salary"+ salary);
	}

	}


