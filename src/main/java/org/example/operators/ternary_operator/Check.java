package org.example.operators.ternary_operator;//Write a Java program to determine whether a given number is even or odd using the ternary operator.

class Check 
{
	public static void  main(String args[])
	{	
		int s = 6 ;
		String result = ( s % 2 == 0) ? "Even" : "Odd" ;
		System.out.println("Number is = " + result );
	}
}