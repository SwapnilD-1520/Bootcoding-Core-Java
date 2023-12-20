package org.example.control_statement.decision_making_statements;

//Build a BMI (Body Mass Index) calculator that takes a person's height and weight as input and categorizes them as underweight, normal weight, overweight, or obese.
class BmiCalculator
{
	
	public static void main(String args[])
	{
		int height = 5;
		int weight = 50;
		if( height == 5 && weight == 50 )
		{
				System.out.println("The Person is normalWeight ");
		}
		else if( height <= 4 && weight <= 40)
		{
				System.out.println("The Person is in underweight ");
		}
		else if( height >= 6 && weight >= 55)
		{
				System.out.println("The Person is in overweight  ");
		}
		else
		{
				System.out.println("The Person is in obese ");
		}
}
		
}