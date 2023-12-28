package org.example.Method;

public class Subtraction {

   public int sub( int p ,int q){

        return( p-q);
    }
        public static void main(String[] args) {
        Subtraction sb = new Subtraction();
        int minus = sb.sub(50,30);
        System.out.println(" Subtraction of Numbers = " + minus);


    }
}
