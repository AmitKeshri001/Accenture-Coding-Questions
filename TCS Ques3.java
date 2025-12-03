package com.amit;

import java.util.ArrayList;
import java.util.Scanner;

public class TCS_Q3
{
    /*  Given an integer array Arr of size N the task is to find the count of elements whose value is greater than
    all of its prior elements.

      Note : 1st element of the array should be considered in the count of the result.

      For example,
      Arr[]={7,4,8,2,9}
      As 7 is the first element, it will consider in the result.
      8 and 9 are also the elements that are greater than all of its previous elements.
      Since total of  3 elements is present in the array that meets the condition.
      Hence the output = 3.
      Example 1:

      Input
      5 -> Value of N, represents size of Arr
      7-> Value of Arr[0]
      4 -> Value of Arr[1]
      8-> Value of Arr[2]
      2-> Value of Arr[3]
      9-> Value of Arr[4]

      Output :
          3


      Constraints
      1<=N<=20
      1<=Arr[i]<=10000
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Value of N\n");
        int n = sc.nextInt();
        if (n<1 || n>20)
        {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Enter the Elements of the Array\n");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]<1 || arr[i]>10000)
            {
                System.out.println("Invalid Input\n");
                return;
            }
        }

//      7 4 8 2 9
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
        return;

    }
}
