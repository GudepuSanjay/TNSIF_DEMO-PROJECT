package com.tnsif.method_overriding;

class MethodExample{
	public void Parent() {
		System.out.println("This is a Parent class");
	}
}

class MethodExample1 extends MethodExample{
	public void Parent() {
		System.out.println("This is a overridden method...");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		MethodExample1 obj =new MethodExample1();
		obj.Parent();
	}

}
