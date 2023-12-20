package org.example.control_statement.decision_making_statements;//Write a program that takes the current temperature as input and advises the user on what to wear (e.g., shorts and t-shirt for high temperatures, coat for cold temperatures).
 
 class WeatherAdviser 
{
	
	public static void main(String args[])
	{
		float temp = 36.9f;
		if( temp > 36.8)
		{
			System.out.println(" wear Shorts & t-shirt ");
		}
		else
		{
				System.out.println(" wear coat ");
		}
	}
	
 }