package com.tnsif.static_members;
class StaticExample{
	static String companyName="Infosys";
	
	String compName;
	
	StaticExample(String Name){
		compName=Name;
	}
	
	public static void display() {
		System.out.println("Before Company Name :"+companyName);

	}
	public void display1() {
		System.out.println("After Company Name :"+compName);

	}
	
	static {
		System.out.println("Hello This is a Static Block....");
	}
	
}


public class StaticDemo {

	public static void main(String[] args) {
		
		StaticExample obj=new StaticExample("Google");
		StaticExample.display();
		obj.display1();
	}

}
