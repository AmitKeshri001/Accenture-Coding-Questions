package com.amit;

import java.util.Scanner;

public class TCS_Q2
{
    /*Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’.
    The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string.
    The string is considered valid if the number of ‘*’ and ‘#’ are equal.
    The ‘*’ and ‘#’ can be at any position in the string.
    Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

        (*>#): positive integer
        (#>*): negative integer
        (#=*): 0
    Example 1:
    Input 1:

        ###***   -> Value of S
    Output :

        0   → number of * and # are equal


     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String consist of only # or *\n");
        String str  = sc.next();

        if(!str.matches("[#*]+"))
        {
            System.out.println("Invalid Input");
            return;
        }
        char ch1 = '#';
        char ch2 = '*';

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch1)
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }
        if(count1 == count2)
        {
            System.out.println(0 + " --> " + " number of * and # are equal");
            return;
        }
        else if (count1>count2)
        {
            int diff1 = count1-count2;
            System.out.println(diff1 + " of * is required to make valid String");
            return;
        }
        else
        {
            int diff2 = count2-count1;
            System.out.println(diff2 + " of # is required to make valid String");
            return;
        }
    }
}
