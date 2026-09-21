package com.tnsif.java.programs;

import java.util.*;

public class QueueExample {
public static void main(String[]args) {
	Queue<Integer>q = new LinkedList<>();
	q.add(10);
	q.add(null);
	q.add(9);
	q.add(40);
	q.add(50);
	q.add(100);
	System.out.println("Queue"+ q);
	System.out.println("Head element "+q.peek());
	q.remove();
	
System.out.println("after removing "+ q);
}
}
