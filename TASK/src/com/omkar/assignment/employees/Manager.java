package com.omkar.assignment.employees;


public class Manager extends Employee{

 private String teamName;
 // constructors 
 public Manager(String name ,int employeeId, double salary,String teamNAme )
 {
	 super(name,employeeId,salary);
	 this.teamName =teamName;
 }
 // getter 
 public String getTeamName()
 {
	 return teamName; 
 }
 // setter 
 public void setTeamName(String teamname)
 {
	 this.teamName = teamName;
 }
 
 //displays manager informatio 
 public void diaplayManagerInfo()
 {
	 displayBasicInfo();
	 System.out.println("team Name "+ teamName);
 }
}

