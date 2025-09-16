package com.gudepusanjay.assignment.employees;

public class Manager extends Employee {
	
	private String department; 
	
	public Manager(int empId,String empName, double empSalary,String department)
	{
		super(empId,empName,empSalary);
		this.department=department;
	}
	
	public String getempDepart() {
		return department;
	}
	
	public void setDepart(String depart)
	{
		department=depart;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("EmpDepartment: "+department);
	}
	
}
