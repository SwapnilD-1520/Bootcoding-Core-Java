package org.example.loops.for_loop;//Write a program to print all even numbers between 1 and 20 using a for loop.
 
class EvenNumber
{
	public static void main(String args[])

	{
		for(int i=1; i<=20; i++)
		{
	 		if(i%2==0)
		 	System.out.println("The Even numbers = "+ i);
		}
	}	
}