package com.tnsif.method_overloading;

class Calculator{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double add(double a,double b)
	{
		return a+b;
		
	}
	public int add(int a, int b,int c)
	{
		return a+b+c;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		System.out.println(obj.add(2, 5));
		System.out.println(obj.add(2.5, 5.25));
		System.out.println(obj.add(44,34,21));
		
		
	}

}
