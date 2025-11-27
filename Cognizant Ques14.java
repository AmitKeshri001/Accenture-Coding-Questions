package com.amit;

import java.util.ArrayList;
import java.util.Scanner;

public class Cognizant_Q14
{
    /* Problem Statement – Bela  teaches her daughter  to find the factors of a given number.
     When she provides a number to her daughter, she should tell the factors of that number.
     Help her to do this, by writing a program.  Write a class FindFactor.java and write the main method in it.
     Note :

     If the input provided is negative, ignore the sign and provide the output. If the input is zero
     If the input is zero the output should be “No Factors”.


     Sample Input 1 :

         54

     Sample Output 1 :

        1, 2, 3, 6, 9, 18, 27, 54

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = Math.abs(sc.nextInt());
        if(n==0)
        {
            System.out.println("No factors");
            return;
        }
        System.out.println("all the factors of n is listed below :");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
            if(i!=list.size()-1)
            {
                System.out.print(", ");
            }

        }
        return;
    }
}
