package org.example.operators.logical_operators;//Develop a Java program to check whether a number is divisible by both 2 and 3

class Divisible

{
	public static void main(String args[])
	{
		int a = 20;
		if( a % 2 == 0 && a % 3 == 0)
		{
			System.out.println("The number is divisible ");
		}
		else
		{	
			System.out.println("The number is not divisible ");	
		}
	}	
}