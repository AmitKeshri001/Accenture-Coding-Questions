package com.amit;

import java.util.Scanner;

public class Cognizant_Q6
{
    /*Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons.
    When her teacher tells a month, she needs to say the season corresponding to that month.
     Write a program to solve the above task.

    Spring – March to May,
    Summer – June to August,
    Autumn – September to November and,
    Winter – December to February.
    Month should be in the range 1 to 12.  If not the output should be “Invalid month”.

    Sample Input 1:

    Enter the month:11
    Sample Output 1:

    Season:Autumn

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test case as many you want\n");
        int T = sc.nextInt();
        while(T --> 0) {
            System.out.println("Enter the month\n");
            int m = sc.nextInt();
            switch (m) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Winter\n");
                    break;

                case 3:
                case 4:
                case 5:
                    System.out.println("Spring\n");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer\n");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn\n");
                    break;

                default:
                    System.out.println("Invalid Input\n");
            }
        }
        return;

    }
}
