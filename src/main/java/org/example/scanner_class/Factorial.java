//Create a program that calculates the factorial of a given number. Validate input to ensure it's a non-negative integer.
package org.example.scanner_class;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int fact = 1;
        Scanner f1 = new Scanner(System.in);
        System.out.println(" Enter Number = ");
        int number = f1.nextInt();
        for (int b = 1; b <= number; b++)
        {
            fact = fact * b;
        }
        System.out.println(" The factorial of a Given Number = " + fact);
    }
}
