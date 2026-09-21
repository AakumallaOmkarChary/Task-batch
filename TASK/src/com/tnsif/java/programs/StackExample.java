package com.tnsif.java.programs;
import java.util.*;
public class StackExample extends QueueExample {

	public static void main(String[] args) {
		Stack<Integer>s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(200);
		System.out.println("Stack "+ s);
		
		System.out.println("Top element "+ s.peek());
		s.pop();
		System.out.println("After poping  "+ s);
		

	}

}
