package com.tnsif.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		
		lhs.add(44);
		lhs.add("Sanjay");
		
		lhs.add(33);
		lhs.add("Bharath");
		System.out.println(lhs);
		
		lhs.add("Sanjay");
		lhs.add("Sai Kiran Reddy");

	}

}
