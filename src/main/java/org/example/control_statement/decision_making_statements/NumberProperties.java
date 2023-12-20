package org.example.control_statement.decision_making_statements;

//Implement a program that takes an integer as input and checks whether it's prime, even, odd.
class NumberProperties 
{
	
	public static void main(String args[])
	{
		int num = 23;
		{
			System.out.println(" The Given value is = " + num );
			
		}
		if( num % 2 == 0)
		{
			System.out.println(" The Number is even ");
		
		}
		else if( num % 2 == 1)
		{
			System.out.println("The Number is odd ");
		}
		else 
		{
			System.out.println(" The Number is prime ");
		}
	}	
}