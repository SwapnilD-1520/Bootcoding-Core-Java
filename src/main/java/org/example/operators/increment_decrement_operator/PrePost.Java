package org.example.operators.increment_decrement_operator;//Write a Java program that demonstrates the use of the post-increment and pre-increment operators.

class PrePost
{	
	public static void main(String args[])
	{
		int a = 10;
		int y = ++a;
		System.out.println(y);
		
		int p = 20;
		int q = p++;
		System.out.println(q);
		System.out.println(q = + p++);
	}
}