package com.amit;

import java.util.Scanner;

public class TCS_Q5
{
    /*A party has been organised on cruise. The party is organised for a limited time(T).
    The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array.
     The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

        Example 1:
        Input :

        5    -> Value of T
        [7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line
        [1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
        Output :
        8     -> Maximum number of guests on cruise at an instance.

        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time\n");
        int T = sc.nextInt();
        if(T<1 || T>25)
        {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Enter the number of guest entering\n");
        int[] E = new int[T];
        for (int i = 0; i < T; i++)
        {
            E[i] = sc.nextInt();
            if(E[i]<0 || E[i]>500)
            {
                System.out.println("Invalid Input ");
                return;
            }
            System.out.println();
        }

        System.out.println("Enter the guest who leaves per hours\n");
        int[] L = new int[T];
        for (int i = 0; i < T; i++)
        {
            L[i]  = sc.nextInt();
            if(L[i]<0 || L[i]>500)
            {
                System.out.println("Invalid Input ");
                return;
            }
            System.out.println();
        }

        int guest = 0;
        int max = -1;
        int k=0;
        while(k<E.length && k<L.length)
        {
            guest = guest + (E[k] - L[k]);
            if(guest>max)
            {
                max = guest;
            }
            k++;
        }

        System.out.println(max);
        return;

    }
}
