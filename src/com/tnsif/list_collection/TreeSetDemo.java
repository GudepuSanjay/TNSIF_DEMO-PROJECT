package com.tnsif.list_collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
	TreeSet<String> ts =new TreeSet<>();
	
	
	ts.add("Sanjay");
	ts.add("Ruthvik Reddy");
	ts.add("C8");
	ts.add("SaiKiran Reddy");
	ts.add("Sanjay");
	System.out.println(ts);
	
	System.out.println(ts.getFirst());
	
	System.out.println(ts.getLast());
	
	System.out.println(ts.removeFirst());
	System.out.println(ts.removeLast());
	
	System.out.println(ts);

	

	}

}
