package org.example.operators.logical_operators; //Implement a program to determine whether a student is eligible for admission to a university based on the criteria of age and percentage.

class Student
{
	public static void main(String args[])
	{	
		int age = 20;
		int percentage = 60;
		if(age <= 20 && percentage <= 60)
		{	
			System.out.println("Student is Eligible ");
		}
		else
		{	
		 	System.out.println("Student is not Eligible ");
		}
	}
}