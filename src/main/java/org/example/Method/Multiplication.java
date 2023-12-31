package org.example.Method;

public class Multiplication {


    public int multi(int m,int n){

        return(m * n);
    }
        public static void main(String[] args) {
        Multiplication m1 = new Multiplication();
        int into = m1.multi(10,7);
        System.out.println(" Multiplication of Numbers = " + into );


    }
}
