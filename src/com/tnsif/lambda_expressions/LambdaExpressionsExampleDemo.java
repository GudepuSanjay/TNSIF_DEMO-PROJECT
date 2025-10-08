package com.tnsif.lambda_expressions;

import java.util.Arrays;
import java.util.List;

interface Addable{
	int add(int a ,int b); 
};

public class LambdaExpressionsExampleDemo {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("Sanjay","Bharath","Sai kiran","Harsha");
		names.forEach(name->System.out.println("Hello "+ name));
		
		Addable obj =(a,b)->{
			System.out.println("Adding Numbers...");
			return a+b;
		};
		System.out.println("Result: "+obj.add(10, 15));
		
	}

}
