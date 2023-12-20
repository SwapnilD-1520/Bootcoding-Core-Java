package org.example.operators.assignment_operators;// Implement a program to calculate the simple interest using this formula (simpleInterest = principal * (1 + rate * time)).

class SimpleIntrest
{
	public static void main(String args[])
	{
		int principle = 5;
		int rate = 8;
		int time = 7;
		int simple;
		
		simple = (principle *(1 + rate * time));
		
		System.out.println("principle =" + principle);
		System.out.println("rate =" + rate);
		System.out.println("principle =" + time);
		System.out.println("Simple Intrest = " + simple );
	
	}
}