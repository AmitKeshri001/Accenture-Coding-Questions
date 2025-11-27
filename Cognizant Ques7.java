package com.amit;

import java.util.Scanner;

public class Cognizant_Q7
{
    /*Problem Statement –
    To speed up his composition of generating unpredictable rhythms, Blue Bandit wants the list of prime numbers
    available in a range of numbers.Can you help him out?

    Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

    Note

    Input 1 should be lesser than Input 2. Both the inputs should be positive.
    Range must always be greater than zero.
    If any of the condition mentioned above fails, then display “Provide valid input”
    Use a minimum of one for loop and one while loop
    Sample Input 1:

        2

        15

    Sample Output 1:

        2 3 5 7 11 13

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input1\n");
        int a = sc.nextInt();
        System.out.println("Enter the Input2\n");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println("Provide valid input\n");
            return;
        }
        if(a<=0)
        {
            System.out.println("Provide valid input\n");
            return;
        }

        for(int i=a;i<=b;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        return;
    }

    private static boolean isPrime(int a)
    {
        int i=2;
        while(i<=Math.sqrt(a))
        {
            if(a%i==0)
            {
                return false;
            }
            i++;
        }
        return true;
    }

}
