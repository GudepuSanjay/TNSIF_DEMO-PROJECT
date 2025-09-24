package com.tnsif.threads;

public class JoinMethodDemo extends Thread {
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(getName() + " - Count: " + i);
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class JoinMain {
	public static void main(String[] args) {
		JoinMethodDemo obj1 = new JoinMethodDemo();
		JoinMethodDemo obj2 = new JoinMethodDemo();
		
		obj1.start(); 
		
		try {
			obj1.join(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		obj2.start(); 
	}
}
