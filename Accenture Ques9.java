package com.amit;

import java.util.Scanner;

public class Accenture_Q9
{
    /*The function accepts a string ‘str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments
     Implement the function to modify and return the string ‘ str’ in such a way that
     all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and
     all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.


    Assumption: String Contains only lower-case alphabetical letters.

    Note:

    Return null if string is null.
    If both characters are not present in string or both of them are same ,
    then return the string unchanged.
    Example:

    Input:
    Str: apples
    ch1:a
    ch2:p
    Output:
    paales

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String \n");
        String str = sc.next();
        System.out.println("Its length is " + " " + str.length());
        System.out.println("enter the first character \n");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter the second character\n");
        char ch2 = sc.next().charAt(0);

        System.out.println(Replace(str , ch1 , ch2));
        return;
    }

    private static String Replace(String str , char ch1 , char ch2)
    {
        StringBuilder sc = new StringBuilder();
        if(str.isEmpty())
        {
            return null;
        }
        if(ch1 == ch2)
        {
            return str;
        }

        if(!str.contains(String.valueOf(ch1)) || !str.contains(String.valueOf(ch2)))
        {
            return str;
        }
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch1)
            {
                sc.append(ch2);
            } else if (str.charAt(i) == ch2)
            {
                sc.append(ch1);
            }
            else
            {
                sc.append(str.charAt(i));
            }

        }
        return sc.toString();
    }
}
