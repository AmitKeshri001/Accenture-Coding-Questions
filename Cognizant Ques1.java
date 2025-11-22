package com.amit;

import java.util.Scanner;

public class Cognizant_Q1
{
    /*Problem Statement – Write a program to calculate the fuel consumption of your truck.
    The program should ask the user to enter the quantity of diesel to fill up the tank
    and the distance covered till the tank goes dry.
    Calculate the fuel consumption and display it in the format (liters per 100 kilometers).
    Convert the same result to the U.S. style of miles per gallon and display the result.
    If the quantity or distance is zero or negative display ” is an Invalid Input”.

   [Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the
    European approach (fuel / distance ). Also note that 1 kilometer is 0.6214 miles,
     and 1 liter is 0.2642 gallons.]

    The result should be with two decimal place.To get two decimal place refer the below-mentioned
     print statement :

    float cost=670.23;

System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);

    Sample Input 1:

    Enter the no of liters to fill the tank
           20

    Enter the distance covered
           150
    Sample Output 1:

          Liters/100KM
          13.33

          Miles/gallons
          17.64

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Liters to fill the tank\n");
        int l = sc.nextInt();
        System.out.println("Enter the distance covered\n");
        int d = sc.nextInt();

        if(l<=0 || d<=0)
        {
            System.out.println("It is an Invalid input\n");
            return;
        }
        double consumption = ((double) l /d) * 100;

        System.out.printf("Your required ans in Liters/100KM is %.2f\n", consumption);


        double miles = d * 0.6214;
        double gallon = l * 0.2642;

        double consumption2 = (miles/gallon);

        System.out.printf("Your required ans in miles/gallons is %.2f\n",consumption2);
        return;
    }
}
