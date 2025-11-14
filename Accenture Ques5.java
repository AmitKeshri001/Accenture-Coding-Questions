package com.amit;

import java.util.Scanner;

public class Accenture_Q5
{
    public static void main(String[] args) {
      /* The function accepts two integers n, m as arguments
         Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n.
         Return difference between sum of integers not divisible by n with sum of numbers divisible by n.

         Assumption:

         n>0 and m>0
         Sum lies between integral range
         Example

         Input
         n:4
         m:20
         Output
         90

       */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n\n");
        int n = sc.nextInt();
        System.out.println("enter m\n");
        int m = sc.nextInt();
        System.out.println(solve(n,m));


    }
    private static int solve(int n , int m)
    {
        int sumN = 0;
        int SumY = 0;
        for(int i=1;i<=m;i++)
        {
            if(i%n != 0)
            {
                sumN = sumN + i;
            }
            else if(i%n == 0)
            {
                SumY = SumY + i;
            }
        }
        return sumN - SumY;
    }
}
