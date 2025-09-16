package com.tnsif.hybrid_inheritance;

class HelloWorld{
	public void prepare() {
		System.out.println("Hello This is a Hybrid Inheritance..");
	}
}

class HelloWorld1 extends HelloWorld{
	public void prepare1() {
		System.out.println("Hello this is from Multilevel Inheritance class from Parent class");
	}
	
}

class A extends HelloWorld{
	public void printing()
	{
		System.out.println("Hello This is a Multilevel Inheritance from printing method..");

	}
}

class B extends A{
	public void printing1() {
		System.out.println("Hello This is a Multilevel Inheritance from printing1 method ..");

	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		
		HelloWorld1 obj=new HelloWorld1();
		obj.prepare();
		obj.prepare1();
		
		B obj1 =new B();
		obj1.printing();
		obj1.printing1();
		obj1.prepare();
		
		
		
	}

}
