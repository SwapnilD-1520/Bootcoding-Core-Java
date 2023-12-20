package org.example.loops.for_loop;//Write a program to calculate and print the sum of even numbers from 1 to 15 using a for loop.

class SumEvenNumbers
{
	public static void main(String args[])
        {
	 	 	int sum = 0;
			for(int i=1; i<=15; i++)
			{
				if(i%2==0)
				{
		  			sum = sum + i;	
				}

			}
	        	System.out.println("The sum of even nos ="+ sum);

	}
	
}