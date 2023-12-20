package org.example.operators.arithmatic_operators;//Implement a program to calculate the area and perimeter of a rectangle using  length and width.

class Rectangle 
{
	public static void main(String args[])
	{	
		int length = 5;
		int width  = 8;
		System.out.println("Area of rectangle =" + (length * width) );
		System.out.println("perimeter of rectangle =" + (2 * (length + width)) );	
	}
}