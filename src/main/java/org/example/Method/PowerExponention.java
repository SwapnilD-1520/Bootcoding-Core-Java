package org.example.Method;

public class PowerExponention
{
    public int power(int a)
    {
        int n = 2;
        int power = 1;
        System.out.println("The 2 raised to the power 0 " + " is " + 1 );
        for( int i = 1; i<=a; i++)
        {
            power = power * n;

            System.out.println("The 2 raised to the power " + (i)  +" is " + power );

        }
            return (power);
    }

    public static void main(String[] args)
    {
        PowerExponention p1 = new PowerExponention();
        int pow = p1.power(5);

        System.out.println(" The power of 5 is " + pow);
    }

}
