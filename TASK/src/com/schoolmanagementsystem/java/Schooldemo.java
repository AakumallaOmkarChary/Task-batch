package com.schoolmanagementsystem.java;
import java.util.Scanner;

	
	class person {
		private String name;
		private int age ;
		
		public void setName(String name )
		{
			this.name=name;
			
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public void displaypersondetails()
		{
			System.out.println("Name "+ name);
			System.out.println("Age "+ age);
		}
	}
	class student extends person{
		private int rollNo;
		private String course;
		
	public void setrollno(int rollNo) {
		this .rollNo = rollNo;
	}
	public void setCourse(String course) {
		this .course= course; 
	}
	public void displayStudentdetails()
	{
		System.out.println("ROllNO "+ rollNo);
		System.out.println("course "+course );
	}
	}
	
	public class Schooldemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student s= new student();
		System.out.print("Enter your name : ");
		String name =sc.nextLine();
		
		System.out.print("Enter your age ");
		int age=sc.nextInt();
		
		System.out.print("Enter your rollno : ");
		int rollNO=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter your course name : ");
		String course=sc.nextLine();
		
		
		s.setName(name);
		s.setAge(age);
		s.setrollno(rollNO);
		s.setCourse(course);
		
		System.out.println("\nstudent details");
		s.displaypersondetails();
		s.displayStudentdetails();
	sc.close();}


	}
