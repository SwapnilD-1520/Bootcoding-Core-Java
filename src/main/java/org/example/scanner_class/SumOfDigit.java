//Calculate the sum of the digits of a given integer.
package org.example.scanner_class;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter a Number = ");
        int number = obj.nextInt();
        int sum  = 0;

        while( number  > 0)
        {
            int rem = number % 10;
            sum = sum + rem;
            number = number /10;

        }
        System.out.println(" The sum of Digits =  "+ sum );


    }
}
