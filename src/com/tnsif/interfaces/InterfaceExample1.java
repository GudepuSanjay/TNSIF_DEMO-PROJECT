package com.tnsif.interfaces;
 
interface Interface_demo{
	int a=10;
	void show();
}

class Interface_class implements Interface_demo{
	public void show() {
		System.out.println("This method implements the interface...");
	}
	
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		
		Interface_class obj= new Interface_class();
		obj.show();
	}

}
