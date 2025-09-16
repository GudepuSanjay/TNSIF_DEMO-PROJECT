package com.tnsif.single_inheritance;

class Single{
	public void singleMethod() {
		System.out.println("Hello Welcome to Single Inheritance..");
	}
}
class childOfSingle extends Single{
	public void singleMethod1() {
		System.out.println("Hello Welcome to Single Inheritance from  singleMethod1..");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		childOfSingle obj= new childOfSingle();
		
		obj.singleMethod();
		obj.singleMethod1();
	}

}
