package com.tnsif.java.procedureconsumerproblem;

public class consumer extends Thread  {
	SharedBuffer buffer;
consumer( SharedBuffer buffer){
	this .buffer = buffer;
		
	}
public void run() {
	for(int i =1 ;i<= 5;i++) {
		try {
			buffer.consume();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

}
