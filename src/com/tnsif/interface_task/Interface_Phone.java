package com.tnsif.interface_task;

 interface Phone{
	void call();
	void sms();
}

 class Jio implements Phone{
	public void call()
	 {
		 System.out.println("This is a Jio Call");
	 }
	public void sms()
	 {
		 System.out.println("This is a Jio SMS");
	 }
 }
 
 class Samsung implements Phone{
	 public void call()
	 {
		 System.out.println("This is a Samsung Call");
	 }
	public void sms()
	 {
		 System.out.println("This is a Samsung SMS");
	 }
	 
 }

public class Interface_Phone {

	public static void main(String[] args) {
		
		Jio obj= new Jio();
		obj.call();
		obj.sms();
		
		Samsung obj1=new Samsung();
		obj1.call();
		obj1.sms();

	}

}
