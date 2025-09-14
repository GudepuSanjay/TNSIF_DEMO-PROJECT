package com.tnsif.palindrome;

public class Palindrome_Number {

	public static void main(String[] args) {

		int num=123;
		
		int reverse = 0;
		
		int original =num;
		
		while(num >0)
		{
			int digit = num%10;
			
			reverse =reverse * 10 + digit;
			
			num = num/10;
			
		}
		
		if(original == reverse)
		{
			System.out.println(original+" is a palindrome number");
		}
		
		else {
			System.out.println(original +" is not a palindrome number");
		}
		
		
	}

}
