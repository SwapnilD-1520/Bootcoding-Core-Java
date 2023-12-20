package org.example.variables.instance_variables;

class Person
{
  String name;
  int age;
  String address; 

public static void main(String args[]){
  Person s1 = new Person();
  s1.name = "Rahul";
  s1.age =24;
  s1.address = "New Nandanwan Nagpur";
 System.out.println(" name="+ s1.name );
 System.out.println(" age =" + s1.age);
 System.out.println("address =" + s1.address);

}
}
