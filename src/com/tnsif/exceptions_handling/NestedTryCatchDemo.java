package com.tnsif.exceptions_handling;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
		try {
			int arr[]= {10,20,30,40,50};
			try {
				int divide=arr[3]/0;
				System.out.println(divide);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println("General Exception: "+e);
			
		}
	}

}
