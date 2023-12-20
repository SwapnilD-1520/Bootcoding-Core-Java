package org.example.loops.for_loop;//Create a program to calculate and print the factorial of a number entered by the user using a for loop

class Factorial
{
	public static void main(String args[])
	{
	


		int fact = 1;
		for( int i=1; i<=5; i++)
	{
		fact =fact*i;
	}	
		System.out.println("factorial for Number 5 =" + fact);
		
	}	
}