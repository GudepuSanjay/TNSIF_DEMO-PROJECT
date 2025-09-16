package com.tnsif.superkeyword;


class Animal{
	public void bark() {
		System.out.println("Hello Barking from parent class...");
		
	}
}

class SecondAnimal extends Animal{
	public void bark2()
	{
		System.out.println("Hello Barking from Second Animal class...");
		super.bark();

	}
	
}

class ThirdAnimal extends Animal{
	public void bark3() {
		System.out.println("Hello Barking from ThirdAnimal class...");
		super.bark();

	}
	
}

public class SuperKeyWord_Implementation {

	public static void main(String[] args) {

		ThirdAnimal obj=new ThirdAnimal();
		
		obj.bark3();
		
		SecondAnimal obj1=new SecondAnimal();
		
		obj1.bark2();
	}

}
