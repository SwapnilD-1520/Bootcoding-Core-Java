package org.example.operators.relational_operators;//Write a program to check whether a given year is a leap year or not.

class LeapYear
{
	public static void main(String args[])
	{
		int y =  2023;
		if(y % 4 == 0 && y % 100!=  0)
		{
			System.out.println(" The given year is leap year ");	
		}
		else
		{
			System.out.println(" The given year is not leap year ");	
		}
	}
}