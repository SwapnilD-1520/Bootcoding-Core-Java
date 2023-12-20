//Calculate the area of different shapes (circle, square, triangle) based on user input. Use appropriate formulas for each shape.
package org.example.scanner_class;

import java.util.Scanner;

public class AreaOfShape {
    public static void main(String[] args) {
        //int area;
        int base = 8;
        int height = 9  ;
        int radius =  8;
        Scanner area1 = new Scanner(System.in); //creating  first object for taking input from user
        Scanner area2 = new Scanner(System.in); //creating second object taking input from user
        Scanner area3 = new Scanner(System.in); //creating second object taking input from user
        System.out.println(" Enter Number = ");
        System.out.println(" Enter radius = ");
        System.out.println(" Enter base & height = ");


        int square  = area1.nextInt();  //coverting string into integer stored in new variable
        double circle = area2.nextDouble();  //coverting string into double stored in new variable
        double triangle = area3.nextDouble(); //coverting string into integer stored in new variable

            square = square * square ; // formula for area of square i.e (side * side )
            circle = 3.14 * radius * radius ;
            triangle = 1/2 * base * height ;
        System.out.println(" Area of Square   = " + square );
        System.out.println(" Area of circle   = " + circle );
        System.out.println(" Area of Triangle   = " + triangle );


    }
}
