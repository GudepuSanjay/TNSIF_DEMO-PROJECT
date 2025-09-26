package com.tnsif.list_collection;


import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet hset= new HashSet<>();
		
		hset.add(44);
		hset.add("Sanjay");
		
		hset.add(22);
		hset.add("Sanjay");
		hset.add("Sai Kiran");
		
		System.out.println(hset);
		
		hset.remove(3);
		System.out.println("HashSet contains :"+hset.contains(hset));
		
	}

}
