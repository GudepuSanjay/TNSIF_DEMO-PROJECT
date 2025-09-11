package com.tnsif.alloperators;

public class TypesOfOperators {

	public static void main(String[] args) {

		//Arithmetic Operators
		
		int a=5,b=10;
		
		System.out.println("Add:"+(a+b));
		System.out.println("Minus:"+(a-b));
		System.out.println("Multiply:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("Moduls:"+(a%b));
		
		//Relational Operators
		
		int c=10,d=21;
		
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println(c>d);
		System.out.println(c>=d);
		System.out.println(c<d);
		System.out.println(c<=d);
		
		
		//Logical Operators
		
		System.out.println(c>10 && c<30);
		System.out.println(c<10|| c>20);
		System.out.println(!(c==d));
		
		//Assignment Operators
		
		int n=10;
		
		n+=5;
		n-=2;
		n*=3;
		n/=2;
		n%=5;
		System.out.println(n);

		//Unary Operators
		
		int q=2;
		System.out.println(++q);
		System.out.println(q--);
		System.out.println(q);
		
		
		//Ternary Operators
		
		int number =44;
		
		String result =(number%2==0) ? "Even" : "Odd";
		System.out.println(result);







		






		

	}

}
