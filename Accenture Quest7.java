package com.amit;

import java.util.Scanner;

public class Accenture_Q8
{
    /*The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-).
    Implement the function to move all hyphens(-) in the string to the front of the given string.

    NOTE:- Return null if str is null.

    Example :-

    Input:
    str.Move-Hyphens-to-Front
    Output:
        —MoveHyphenstoFront
    Explanation:-

    The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string,
     this output is “— MoveHyphen”

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string contains hyphen");
        String str = sc.next();
        System.out.println("the length of the string is" + " "+ str.length());

        System.out.println(solve(str));
    }

    private static String solve(String str)
    {
        if(str.isEmpty())
        {
            return null;
        }
        StringBuilder sc = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '-')
            {
                sc.append(str.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != '-')
            {
                sc.append(str.charAt(i));
            }
        }

        return sc.toString();

    }
}
