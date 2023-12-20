package org.example.control_statement.decision_making_statements;//Write a Java program that takes a person's age as input and classifies them as a child, teenager, adult, or senior citizen.

class AgeClassifier
{
	
	public static void main(String args[])
	{
		int age = 30;
	
	if( age <= 10)
	{	
		System.out.println("This is a child ");
	}
	else if( age <= 20)
	{	
		System.out.println("This is a Teenager ");
	}
	else if( age <= 50)
	{
		System.out.println("This is an Adult ");
	}
	else
	{
		System.out.println("This is a Senior Citizen ");
	}
}

}