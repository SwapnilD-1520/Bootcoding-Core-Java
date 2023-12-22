package org.example.loops.for_loop;//Calculate Power:
//Create a program that calculates and prints the result of 2 raised to the power of each number from 0 to 5 using a for loop.

class CalculatePower
{
	public static void main(String args[])
	{
			int a = 2;
			int power = 1;
			System.out.println("The 2 raised to the power of number = " + (0) + " is " + 1  ) ;//print hardcode value for 2 raised to the power 0.
			for( int i =1; i<=5; i++)
			{
				power = power * a;
				System.out.println("The 2 raised to the power of number " 	+ i + " is " + power  );
			}
	}	
		
}		
			
		
		
