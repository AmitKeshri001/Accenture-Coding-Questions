package com.amit;

import java.util.Scanner;

public class Cognizant_Q9
{
    /*XYZ Technologies is in the process of increment the salary of the employees.
    This increment is done based on their salary and their performance appraisal rating.

    If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
    If the appraisal rating is between 3.1 and 4, the increment is  25% of the salary.
    If the appraisal rating is between 4.1 and 5, the increment is  30% of the salary.
    Help them to do this,  by writing a program that displays the incremented salary.
     Write a class “IncrementCalculation.java” and write the main method in it.

    Note   :   If either the salary is 0 or negative  (or) if the appraisal rating is not in the range 1 to 5 (inclusive),
    then the output should be “Invalid Input”.

    Sample Input 1 :

    Enter the salary
    8000

    Enter the Performance appraisal rating
    3

    Sample Output  1 :

        8800

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary : ");
        double s = sc.nextDouble();
        System.out.println("Enter the Performance appraisal rating : ");
        double r = sc.nextDouble();

        if(s<1 || r<1 || r>5)
        {
            System.out.println("Invalid Input");
            return;
        }
        if(r>=1 && r<=3)
        {
            s = s + ((s*10)/100);
            System.out.println(s + " ");
            return;
        } else if (r>3 && r<=4)
        {
            s = s+  ((s*25)/100);
            System.out.println(s + " ");
            return;
        }
        else if (r>4 && r<=5)
        {
            s = s + ((s*30)/100);
            System.out.println((int) s);
            return;
        }


    }
}
