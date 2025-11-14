package com.amit;

import java.util.Scanner;

public class Accenture_Q6
{
    public static void main(String[] args) {
      /*  The function accepts an integers arr of size ’length’ as its arguments .
         you are required to return the sum of second largest  element from the even positions and
         second smallest from the odd position of given ‘arr’

        Assumption:

        All array elements are unique
        Treat the 0th position as even
        NOTE

        Return 0 if array is empty
        Return 0, if array length is 3 or less than 3
        Example

        Input
        arr:3 2 1 7 5 4
        output
        7
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of arr");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr, n));
    }
    private static int solve(int[] arr , int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<=3)
        {
            return 0;
        }
        int max1 = -1;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<n;i+=2)
        {
            max1 = Math.max(max1 , arr[i]);

        }
        for (int i = 1; i < n; i+=2)
        {
            min2 = Math.min(min2 , arr[i]);
        }
        int secmax1 = -1;
        for(int i=0;i<n;i+=2)
        {
            if(arr[i] < max1 && arr[i] > secmax1)
            {
                secmax1 = arr[i];
            }

        }
        int secmin2 = Integer.MAX_VALUE;
        for(int i=1;i<n;i+=2)
        {
            if(arr[i] > min2 && arr[i] < secmin2)
            {
                secmin2 = arr[i];
            }

        }

        return secmax1+secmin2;

    }
}
//ada
