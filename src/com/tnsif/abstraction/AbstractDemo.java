package com.tnsif.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Square sq=new Square(5);
		sq.calArea();
		sq.show();
		
		Rectangle re =new Rectangle(12,14);
		re.calArea();
		re.show();
	}

}
