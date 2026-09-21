package com.tnsif.java.procedureconsumerproblem;

public class producer extends Thread {
SharedBuffer buffer;
producer(SharedBuffer buffer){
this.buffer = buffer;	
}
public void run() {
	for(int i =1;i<=5; i++) {
		try {
			 buffer.produce(i);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
}

