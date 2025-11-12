package com.amit;

import java.util.Scanner;

public class Accenture_Q4
{
    /* int findCount(int arr[], int length, int num, int diff);

     The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’.
     Implement this function to find and return the number of elements of ‘arr’ having an
     absolute difference of less than or equal to ‘diff’ with ‘num’.
     Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

     Example:
     Input:

     arr: 12 3 14 56 77 13
     num: 13
     diff: 2
     Output:
         3

     Explanation:
     Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of th array\n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the num \n");
        int num = sc.nextInt();
        System.out.println("enter the diff\n");
        int diff = sc.nextInt();
        int ans = count(arr , n , num , diff);
        System.out.println(ans);
    }

    private static int count(int[] arr, int n, int num, int diff)
    {
        if(n<=0)
        {
            return -1;
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(Math.abs(arr[i]-num) <= diff)
            {
                c++;
            }
        }
        return c;
    }

}
