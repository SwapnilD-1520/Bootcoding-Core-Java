package org.example.Method;

public class EvenOdd
{
    public void find(int p)
    {
        if( p % 2 == 0)
        {
            System.out.println(" The Number is Even");
        }
        else
        {
            System.out.println(" The Number is Odd");
        }

    }

        public static void main(String[] args)
        {
            EvenOdd E1 = new EvenOdd();
            E1.find(5);
        }

}
