package com.tnsif.list_collection;


import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list =new LinkedList<>();
		
		list.add(44);
		list.add("Sanjay");
		
		list.add("C8");
		list.add("SaiKiran Reddy");
		
		list.addFirst(33);
		list.addLast("Ruthvik Reddy");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);

	}

}
