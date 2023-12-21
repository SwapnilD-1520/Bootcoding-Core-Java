//Calculate the area of different shapes (circle, square, triangle) based on user input. Use appropriate formulas for each shape.
package org.example.scanner_class;

import java.util.Scanner;

public class AreaOfShape {

    static float  pi = 3.14f;
             public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            //
            System.out.println(" Enter Radius = ");
             float radius = sc.nextFloat();    //float radius =  variable declaration
             double area = 3.14 * radius * radius ;
            System.out.println(" Area of Circle = " + area );


             System.out.println(" Enter Side = ");
             int side = sc.nextInt();     //int side = variable declration
             int sqr = side * side;
            System.out.println(" Area of square = " + sqr );

            System.out.println(" Enter base & Height");
            int base =  sc.nextInt();       // variable declaration
            int height = sc.nextInt();     //variable declaration
            int calculate =  (base * height)/2;
            System.out.println(" Area of Triangle = " + calculate );








    }
}
