package com.tnsif.string_operations;

public class StringOperationsDemo {

	public static void main(String[] args) {
		
		String str1="Gudepu";
		String str2="Sanjay";
		
		System.out.println("Concatenation: "+str1+" "+str2);
		System.out.println("String length: "+str1.length());
		System.out.println("String UpperCase: "+str1.toUpperCase()+" "+str2.toUpperCase());
		System.out.println("Character at Index 1 of str1: "+str1.charAt(1));
		System.out.println("Sub String: "+str1.substring(1,4));
		System.out.println("Equals Check: "+str1.equals(str2));
		
		//String Buffer Operations
		
		StringBuffer stb =new StringBuffer("I Love");
		
		stb.append(" Indian");
		System.out.println("Append: "+stb);
		
		stb.replace(2,6,"am");
		System.out.println("Replace: "+stb);
		
		stb.delete(5,12);
		System.out.println("Deleted: "+stb);
		
		stb.reverse();
		System.out.println("Reverse: "+stb);
		
		stb.insert(5," Indian");
		System.out.println("Insertion: "+stb);
		
		//String Builder Operations
		
		StringBuilder sbb=new StringBuilder("Core Java");
		
		sbb.append(" Programming");
		System.out.println("Append: "+sbb);
		
		sbb.insert(21," Language");
		System.out.println("Insertion: "+sbb);
		
		sbb.replace(0,4,"Adavanced");
		System.out.println("Replace: "+sbb);
		
		sbb.delete(14, 26);
		System.out.println("Deletion: "+sbb);
		
		
		
		

	}

}
