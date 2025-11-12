package com.amit;

import java.util.Scanner;

public class Accenture_Q1
{
    public static void main(String[] args) {
       /* The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument.
        ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes ,
        and each ith element of array ‘arr’ represents the amount of food present in ‘ith’ house number, where 0 <= i

        Note:

        Return -1 if the array is null
        Return 0 if the total amount of food from all houses is not sufficient for all the rats.
        Computed values lie within the integer range

        */
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // no. of rats;
        int unit = sc.nextInt(); // unit (food per rat)
        int n = sc.nextInt();  //soxe of the array;
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(count(arr,r,unit,n));

    }

    private static int count(int[] arr, int r, int unit, int n)
    {
        if(n==0)
        {
            return -1;
        }
        int res = r*unit;
        int sum=0;
        int count=0;

        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
            count++;
            if(sum>=res)
            {
                break;
            }
        }
        if(sum < res)
        {
            return -1;
        }
        return count;
    }
}
//ye thik hai
