package com.amit;

import java.util.Scanner;

public class Cognizant_Q2
{
    /* Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during
     break time he bought pizzas, puffs and cool drinks. Consider
     the following prices :
     Rs.100/pizza
     Rs.20/puffs
     Rs.10/cooldrink
     Generate a bill for What Vohra has bought.

     Sample Input 1:

     Enter the no of pizzas bought:10
     Enter the no of puffs bought:12
     Enter the no of cool drinks bought:5
     Sample Output 1:

     Bill Details

     No of pizzas:10
     No of puffs:12
     No of cooldrinks:5
     Total price=1290
     ENJOY THE SHOW!!!
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of pizzas\n");
        int pizza = sc.nextInt();
        System.out.println("Enter the number of Dhosa bought\n");
        int dhosa = sc.nextInt();
        System.out.println("Enter the number of Cool Drinks bought\n");
        int coolDrinks = sc.nextInt();

        int sum = 0;
        int a = pizza*50;
        int b = dhosa*5;
        int c = coolDrinks*2;

        sum = a+b+c;

        System.out.println("Your Total Costs is --> " + " " + sum);
        System.out.println("Enjoy the meal ❤️❤️❤️");
        return;
    }
}
