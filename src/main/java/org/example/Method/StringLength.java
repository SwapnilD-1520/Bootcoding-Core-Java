package org.example.Method;

public class StringLength {

    public int StrLength(String p)
    {
        return p.length();
    }
    public static void main(String[] args)
        {
            StringLength str = new StringLength();
            int length = str.StrLength("Marvel");
            System.out.println(" The String Length = " + length );
        }


    }