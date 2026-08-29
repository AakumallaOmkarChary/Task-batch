package com.omkar.assignment.utilities;
import com.omkar.assignment.employees.Employee;
import com.omkar.assignment.employees.Manager;
import com.omkar.assignment.employees.Developer;
public class Employeeutilities {
	//displayu employee details 
	public static void displayEmployee(Employee employee)
	{
		System.out.println("Name" + employee.getName());
		System.out.println("Employee Id" + employee.getEmployeeId());
		System.out.println("salary "+ employee.getSalary());
	}
	// increase salary 
	public static void increaseSalary(Employee employee,double amount)
	{
		employee.setSalary(employee.getSalary()+ amount);
	}
	// display manager details 
	public static void 
	displayManager(Manager manager)
	{
		displayEmployee(manager);
		System.out.println("team Name " + manager.getTeamName());
	}
	// developer details 
public static void 
displayDeveloper(Developer developer )
{
	displayEmployee(developer);
	System.out.println("programminglangiage "+ developer.getprogramminglanguage());
	
}
}
