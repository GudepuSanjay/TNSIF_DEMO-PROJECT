package com.gudepusanjay.assignment.employees;

public class Developer extends Employee {

	private String programmingLanguage;
	
	public Developer(int empId, String empName, double empSal,String programmingLanguage) {
		super(empId, empName, empSal);
		this.programmingLanguage=programmingLanguage;
		
	}
	
	public String getProgLang()
	{
		return programmingLanguage;
	}
	
	public void setProgLang(String progLang)
	{
		programmingLanguage=progLang;
	}

	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("EmpProgrammingLanguage: "+programmingLanguage);
	}
}
