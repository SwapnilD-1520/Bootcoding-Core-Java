package org.example.control_statement.decision_making_statements;//Create a program that calculates the final grade for a student based on their scores in exams, assignments, and participation.

class GradeCalculator
{
	
	public static void main(String args[])

	{
		int score = 90;		
	
	if(score == 90)
	{
		System.out.println(" The student has A Grade ");
	}
	else if( score <= 80)
	{
		System.out.println(" The student has B Grade ");
	}
	else if( score <= 50)
	{
		System.out.println(" The student has C Grade ");
	}
	else
	{	
		System.out.println(" The student is fail ");
	}
	
	}

}