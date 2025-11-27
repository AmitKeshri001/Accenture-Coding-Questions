package com.amit;

import java.util.ArrayList;
import java.util.Scanner;

public class Cognizant_Q13
{
    /* Problem Statement – Raj wants to know the maximum marks scored by him in each semester.
    The mark should be between 0 to 100 ,if goes beyond the range display “You have entered invalid mark.”

     Sample Input 1:

     Enter no of semester:
         3

     Enter no of subjects in 1 semester:
         3

     Enter no of subjects in 2 semester:
         4

     Enter no of subjects in 3 semester:
         2

     Marks obtained in semester 1:
         50
         60
         70
     Marks obtained in semester 2:
         90
         98
         76
         67

     Marks obtained in semester 3:
         89
         76

     Sample Output 1:

     Maximum mark in 1 semester:70
     Maximum mark in 2 semester:98
     Maximum mark in 3 semester:89
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of semester\n");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++)
        {

            System.out.println("enter the no. of subject in " + (i+1) + " sem :" );
            int no_sub = sc.nextInt();


            System.out.println("Enter the marks obtained in each sub in " + (i+1) + "th sem");
            for (int j=0;j<no_sub;j++)
            {
                int marks = sc.nextInt();
                if(marks<0 || marks>100)
                {
                    System.out.println("You have entered invalid mark.");
                    return;
                }
                if(marks>max)
                {
                    max = marks;
                }
            }
            list.add(max);
            max = Integer.MIN_VALUE;

        }

        for(int i=0;i<list.size();i++)
        {
            System.out.println("Maximum mark in " +(i+1) + " semester :" + list.get(i));
        }
        return;
    }
}
