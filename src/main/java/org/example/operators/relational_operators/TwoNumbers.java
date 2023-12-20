package org.example.operators.relational_operators; //Create a Java program that compares two numbers and prints whether the first number is greater than, less than, or equal to the second number.

class  TwoNumbers

{
	public static void main(String args[])
	{
		int a = 5;
		int b = 8;
		System.out.println( a );
		System.out.println( b );
		
		if(a > b)
		{
	 		System.out.println("the first no is greater than second no");
		}
		else 
		{
			System.out.println("the first no is not greater than second no");

		}
		if(a < b)

		{
			System.out.println("the first no less than second no");
			
		}
		
		else	
		{	
			System.out.println("the first is not less than second no");

		}
		
		if(a == b)
		{
			System.out.println("the first is equal to the second no");
		}
		
		else 
		{
			System.out.println("the first is not equal to the second no");
		}
		
	}	
	
}