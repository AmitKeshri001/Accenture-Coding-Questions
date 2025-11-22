package com.amit;

import java.util.Scanner;

public class Cognizant_Q3
{
    /*Problem Statement – Ritik wants a magic board, which displays a character for a corresponding
    number for his science project. Help him to develop such an application.
    For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
        [Assume the number of inputs should be always 4 ]

    Sample Input 1:

    Enter the digits:
        65
        66
        67
        68
    Sample Output 1:

        65-A
        66-B
        67-C
        68-D

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the test case you required\n");
        int T = sc.nextInt();
        while (T --> 0)
        {
            System.out.println("Enter the number ");
            int n = sc.nextInt();
            if(n<32 || n>126)
            {
                System.out.println(n +" "+ "not a character\n");
            }
            else {

                System.out.println("The character pointing to that number is " + n + "-" + (char) (n));
            }
        }
        return;

    }
}
