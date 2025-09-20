package com.tnsif.interface_extends_interface;


interface car{
	void engine();
}

interface bike extends car{
	void interior();
}

class Automobiles implements bike{
	
	public void engine() {
		System.out.println("Engine Condition is Just Awesome....");
	}
	public void interior() {
		System.out.println("Interior is So Good..");
	}
}

public class InterfaceExtendDemo {

	public static void main(String[] args) {
		Automobiles obj = new Automobiles();
		
		obj.engine();
		obj.interior();

	}

}
