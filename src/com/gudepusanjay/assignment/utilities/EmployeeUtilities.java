package com.gudepusanjay.assignment.utilities;

import com.gudepusanjay.assignment.employees.Employee;

public class EmployeeUtilities {
	
	public static void increaseSalary(Employee e , double percent)
	{
		double newSalary= e.getemployeeSalary() +(e.getemployeeSalary() * percent/100);
		e.setEmployeeSalary(newSalary);
	}
	
	public static void printEmployDetails(Employee e)
	{
		e.displayInfo();
	}

}
