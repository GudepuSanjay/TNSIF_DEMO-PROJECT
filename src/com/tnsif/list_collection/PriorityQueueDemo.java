package com.tnsif.list_collection;

import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq =new PriorityQueue<>();
		
		pq.add("Sanjay");
		
		pq.add("Ruthvik Reddy");
		
		pq.add("SaiKiran Reddy");
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		

	}

}
