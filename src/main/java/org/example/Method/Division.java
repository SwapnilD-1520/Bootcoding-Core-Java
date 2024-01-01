package org.example.Method;

public class Division {

    public int Div(int x,int y){

            return(x / y);
        }

         public static void main(String[] args) {
            Division di = new Division();
            int div = di.Div(10,2);
            System.out.println(" Division of Number = " + div );

    }
}
