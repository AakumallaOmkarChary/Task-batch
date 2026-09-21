package com.tnsif.java.programs;
import java.util.*;

public class vectorExample extends QueueExample {

	public static void main(String[] args) {
		Vector<String>v = new Vector<>();
        v.add("omkar");
        v.add(null);
        v.add("Anu");
        System.out.println("vector :" + v);
        v.add(2,"minni");
        System.out.println("After adding "+ v);
        
        v.remove("Anu");
        System.out.println("After removing Anu" + v);
        v.get(2);
      //  v.size();
        System.out.print("After getting " +v);
	}

}
