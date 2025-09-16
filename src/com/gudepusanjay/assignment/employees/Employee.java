package com.gudepusanjay.assignment.employees;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int empId,String empName,double empSal)
	{
		employeeId=empId;
		employeeName=empName;
		employeeSalary=empSal;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int id)
	{
		employeeId=id;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String name) {
		employeeName=name;
	}
	
	public double getemployeeSalary()
	{
		return employeeSalary;
	}
	
	public void setEmployeeSalary(double salary)
	{
		employeeSalary=salary;
	}
	
	public void displayInfo()
	{
		System.out.println("EmpId: "+employeeId+" "+"EmpName: "+employeeName+" "+"EmpSalary: "+employeeSalary);
	}

}
