package org.example.Method;

public class Addition {

         public int add(int a ,int b){          //creating method
             return(a+b);                       //this is returntype for integer method
      }

    public static void main(String[] args) {

            Addition ad = new Addition();   //creating object
            int sum = ad.add(10,20);    //method call and store by taking new variable
            System.out.println(" Sum of the Numbers = " + sum  );   //printing statement
    }



}
