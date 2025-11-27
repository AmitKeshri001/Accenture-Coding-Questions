package com.amit;

import java.util.Scanner;

public class Cognizant_Q8
{
    /*Problem Statement – Goutam and  Tanul plays  by  telling numbers.  Goutam says a number to Tanul.
      Tanul should first reverse the number and check if it is same as the original.  If yes,  Tanul should say “Palindrome”.  If not, he should say “Not a Palindrome”.  If the number is negative, print “Invalid Input”.  Help Tanul by writing a program.

    Sample Input 1 :

        21212

    Sample Output 1 :

    Palindrome

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. :");
        int n = sc.nextInt();
        int orig=n;
        int reverse=0;
        while(n!=0)
        {
            int remain = n%10;
            reverse = reverse*10 + remain;
            n = n/10;
        }

        if(reverse==orig)
        {
            System.out.println("Palindrome :");
        }
        else
        {
            System.out.println("Not Palindrome :");
        }
        return;
    }
}
