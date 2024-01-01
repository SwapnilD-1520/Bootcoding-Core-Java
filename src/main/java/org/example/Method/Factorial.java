package org.example.Method;

public class Factorial {
    public int facto(int n) {

        int fact = 1;
        for (int a = 1; a <= n; a++) {
            fact = fact * a;
        }
            return (fact);
    }

    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        int fact = f1.facto(5);
        System.out.println(" Factorial of Number 5 " + "is " +  fact  );
    }
}


