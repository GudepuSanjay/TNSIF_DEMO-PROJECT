package com.tnsif.hierarchical_multilevel_inheritance;

class Parent1{
	public void hello() { 
		System.out.println("Hello This is Multilevel Inheritance...");
	}
	
}

class child1 extends Parent1{
	public void hello1() {
		System.out.println("This hello1 method is extends Parent1 class...");
	}
}

class child2 extends child1{
	public void hello2() {
		System.out.println("This hello2 method is extends child1 class...");
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {

		child2 obj = new child2();
		
		obj.hello();
		obj.hello1();
		obj.hello2();
	}

}
