package com.amit;

import java.util.Scanner;

public class Accenture_Q11
{
    /*You have to find and return the number between ‘a’ and ‘b’
    ( range inclusive on both ends) which has the maximum exponent of 2.

    The algorithm to find the number with maximum exponent of 2 between the given range is

    Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
    Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent of 2
     so faqrd in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2
     than ‘max’.
    Return ‘max’.
    Assumption: a <b

    Note: If two or more numbers in the range have the same exponents of  2 , return the small number.

        Example

    Input:
        7
        12
    Output:
        8

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a\n");
        int a = sc.nextInt();
        System.out.println("enter the value of b\n");
        int b = sc.nextInt();

        System.out.println(ans(a,b));
        return;
    }

    private static int ans(int a, int b)
    {
        int maxnum = a;
        int maxexp = -1;

        for (int i=a;i<=b;i++)
        {
            int temp = i;
            int count = 0;
            while(temp%2==0)
            {
                count++;
                temp = temp/2;

            }

            if (count > maxexp || (count == maxexp && i<maxnum))
            {
                maxexp = count;
                maxnum = i;
            }
        }
        return maxnum;

    }
}
