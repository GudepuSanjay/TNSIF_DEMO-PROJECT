package com.tnsif.abstraction;


public class Rectangle extends Shape{
	private int height=5,width=8;
	public Rectangle(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
	
	public void calArea()
	{
		super.area=height*width;
	}
}
