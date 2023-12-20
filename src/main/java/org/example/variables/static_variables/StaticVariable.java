package org.example.variables.static_variables;

class StaticVariable

{
 	static  int  myVariable;
	void  add()
	{
		myVariable++;
	}
	public static void main(String args[])
	{
		StaticVariable  sv1 = new  StaticVariable();
		sv1.add();

		StaticVariable  sv2 = new  StaticVariable();
		sv2.add();
		System.out.println("total count of objects  =  " + myVariable);
	}
} 



