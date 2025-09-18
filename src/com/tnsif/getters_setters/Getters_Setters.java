package com.tnsif.getters_setters;


class Getters_Setters_Demo{
	private String name;
	private String depat;
	private int phno;
	
//	Getters_Setters_Demo(String name,String depat,int phno)
//	{
//		this.name=name;
//		this.depat=depat;
//		this.phno=phno;
//	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String Name) {
		name=Name;
	}
	
	public String getDept(){
		return depat;
	}
	public void setDept(String department) {
		depat=department;
	}
	
	public int getPhno() {
		return phno;
	}
	
	public void setPhno(int no)
	{
		phno=no;
	}
}

public class Getters_Setters {

	public static void main(String[] args) {

		Getters_Setters_Demo obj =new Getters_Setters_Demo();
		
		obj.setName("Sanjay");
		obj.setDept("Information Technology");
		obj.setPhno(123456789);
		
		System.out.println(obj.getName());
		System.out.println(obj.getDept());
		System.out.println(obj.getPhno());
		
	}

	

}
