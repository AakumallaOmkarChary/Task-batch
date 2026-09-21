package com.tnsif.java.procedureconsumerproblem;



public class SharedBuffer{
	int value;
	boolean available =false;
	synchronized  void produce(int value) throws InterruptedException{
		while (available) {
			wait();
		}
		this.value =value;
		System.out.println("produced "+ value);
		available =true;
		notify();
	}

synchronized void consume()throws InterruptedException{
	while(!available) {
		wait();
	}
	System.out.println("consumed "+ value);
	available =false ;
	notify();
}
}