package com.amit;

import java.util.Scanner;

public class Cognizant_Q4
{
    /*Problem
    Statement – FOE college wants to recognize the department which has succeeded in getting the
     maximum number of placements for this academic year. The departments that have participated
     in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting
     maximum placements. Check for all the possible output given in the sample snapshot

    Note : If any input is negative, the output should be “Input is Invalid”.
    If all department has equal number of placements, the output should be
    “None of the department has got the highest placement”.

    Sample Input 1:

    Enter the no of students placed in CSE:90
    Enter the no of students placed in ECE:45
    Enter the no of students placed in MECH:70
    Sample Output 1:

    Highest placement
    CSE

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students placed in CSE\n");
        int cse  = sc.nextInt();
        System.out.println("Enter the no.of students placed in ECE\n");
        int ece = sc.nextInt();
        System.out.println("Enter the no.of students placed in MECH\n");
        int mec = sc.nextInt();
        if(cse < 0 || ece < 0 || mec<0)
        {
            System.out.println("Input is Invalid\n");
            return;
        }
        if(cse == ece && cse == mec)
        {
            System.out.println("None of the department has got the highest placement\n");
            return;
        }
        {

        }
        if(cse>ece && cse>mec)
        {
            System.out.println("Highest placement\n CSE");
            return;
        } else if (ece>cse && ece>mec)
        {
            System.out.println("Highest placement\n ECE");
            return;
        }
        else
        {
            System.out.println("Highest placement\n Mech");
        }
        return;
    }
}
