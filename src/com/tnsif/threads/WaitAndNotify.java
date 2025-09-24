package com.tnsif.threads;

class WaitAndNotifyDemo{
	synchronized void waitMethod() {
		System.out.println(Thread.currentThread().getName()+" Waiting");
		try {
			wait();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is resumed after notifying...");
	}
	
	synchronized void notifyMethod() {
		System.out.println(Thread.currentThread().getName() +" is Notifying");
		notify();
	}
	
}


public class WaitAndNotify {

	public static void main(String[] args) {
		WaitAndNotifyDemo obj =new WaitAndNotifyDemo();
		
		Thread t1 = new Thread(()->obj.waitMethod(),"Thread-1");
		Thread t2 = new Thread(()->{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			obj.notifyMethod();
		},"Thread - 2");
		
		t1.start();
		t2.start();
		

	}

}
