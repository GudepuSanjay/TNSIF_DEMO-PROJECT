package com.gudepusanjay;

import com.gudepusanjay.assignment.utilities.EmployeeUtilities;
import com.gudepusanjay.assignment.employees.Developer;
import com.gudepusanjay.assignment.employees.Manager;


public class AssignmentMain {

	public static void main(String[] args) {

		Manager objM =new Manager(244,"Sanjay",65570,"Information Technology");
		Developer objD = new Developer(245,"Mahesh",5350,"Python");
		
		System.out.println("Before Salary Increment...");
		
		EmployeeUtilities.printEmployDetails(objM);
		EmployeeUtilities.printEmployDetails(objD);
		
		EmployeeUtilities.increaseSalary(objM, 10);
		EmployeeUtilities.increaseSalary(objD, 20);
		
		System.out.println("After Salary Increment..");
		
		EmployeeUtilities.printEmployDetails(objM);
		EmployeeUtilities.printEmployDetails(objD);
		
		
		
		
		
	
		
	}

}
