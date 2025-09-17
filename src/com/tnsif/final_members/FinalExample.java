package com.tnsif.final_members;

final class Company{
	final String companyName="Google";
	
	String compName;
	
	Company(String name){
		compName=name;
		System.out.println("Updated Company Name: "+compName);
	}
	
	public final void show() {
		System.out.println("Default company Name: "+companyName);
	}
	
}

public class FinalExample {

	public static void main(String[] args) {
		
		Company obj =new Company("Microsoft");
		obj.show();
	}

}
