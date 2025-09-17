package com.tnsif.constructor_overloading;

class Student{
	String studName;
	int studRoll;
	String studDept;
	
	Student()
	{
		studName="HelloWorld";
		studRoll=244;
		studDept="World";
		System.out.println("Name: "+studName+","+"RollNo: "+studRoll+","+"Department: "+studDept);;
		
	}
	
	Student(String name,int roll)
	{
		studName=name;
		studRoll=roll;
		System.out.println("Name: "+studName+","+"RollNo: "+studRoll);
	}
	
	Student(int roll,String dept,String name)
	{
		studRoll=roll;
		studDept=dept;
		studName=name;
		System.out.println("Name: "+studName+","+"RollNo: "+studRoll+","+"Department: "+studDept);;

	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {

		Student obj =new Student();
		
		Student obj1 =new Student("Sanjay",244);
		
		Student obj2 =new Student(255,"CSE","Bharath");
		

	}

}
