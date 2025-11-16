package com.amit;

import java.util.Arrays;
import java.util.Scanner;

public class Accenture_Q7
{
    /* The function accepts an integers sum and an integer array arr of size n.
     Implement the function to find the pair, (arr[j], arr[k]) where j!=k,
     Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum)
      and return the product of element of this pair

         NOTE

     Return -1 if array is empty or if n<2
     Return 0, if no such pairs found
     All computed values lie within integer range
         Example

     Input

     sum:9

     size of Arr = 7

     Arr:5 2 4 3 9 7 1

     Output
     2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the target sum you want");
        int sum = sc.nextInt();
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(helper(sum , n , arr));
    }

    private static int helper(int sum , int n , int[] arr)
    {
        if(n < 2)
        {
            return -1;
        }
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int ans = a+b;
        if(ans<=sum)
        {
            return a*b;
        }
        return 0;
    }


}
