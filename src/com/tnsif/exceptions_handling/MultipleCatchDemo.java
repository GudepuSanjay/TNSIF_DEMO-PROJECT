package com.tnsif.exceptions_handling;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		
		try {
			int a=10,b=0;
			int c=a/b;
			String str="Sanjay";
			char ch=str.charAt(20);
			System.out.println(ch);
			int[] arr=new int[3];
			arr[10]=50;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exceptions are Handled Successfully");
		}
	}

}
