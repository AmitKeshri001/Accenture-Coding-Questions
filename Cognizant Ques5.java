package com.amit;

import java.util.Scanner;

public class Cognizant_Q5
{
    /* Problem Statement  – In a theater, there is a discount scheme announced where one gets
      a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets,
      and a discount of 2% on the total cost of tickets if a special coupon card is submitted.
      Develop a program to find the total cost as per the scheme.
      The cost of the k class ticket is Rs.75 and q class is Rs.150.
      Refreshments can also be opted by paying an additional of Rs. 50 per member.

     Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time.
      If fails display “Minimum of 5 and Maximum of 40 Tickets”.
       If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

     The ticket cost should be printed exactly to two decimal places.

     Sample Input 1:

     Enter the no of ticket:35
     Do you want refreshment:y
     Do you have coupon code:y
     Enter the circle:k
     Sample Output 1:

     Ticket cost:4065.25

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of tickets\n");
        int ticket = sc.nextInt();
        if(ticket<5 || ticket > 40)
        {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets\n");
            return;
        }
        System.out.println("Do you want refreshments ?\n");
        boolean refreshments = sc.nextBoolean();
        System.out.println("Do you have coupon code?\n");
        boolean code = sc.nextBoolean();
        System.out.println("Enter the circle\n");
        int circle = sc.nextInt();
        int k = 75;
        System.out.println("The per person cost of K class is  : " + k);
        int q = 150;
        System.out.println("The per person cost of q class is  : " + q);
        if(circle != k && circle !=q)
        {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("refreshments are added after all the discount were calculated\n");

        double cost = ticket*circle;
        double discount1 = 0;
        if(ticket>20) {
            discount1 = cost*((double) 10 /100);
        }
        cost = cost - discount1;
        double discount2 = 0;
        if(code)
        {
            discount2 = cost*((double) 2/100);
        }
        cost = cost-discount2;
        int ref = 0;
        if(refreshments)
        {
            ref = ticket*50;
        }
        cost = cost+ref;

        System.out.printf("your total cost after all the discounts is %.2f :" , cost);
        return;

    }
}
//tumhara code bhi sahi hai amit bus kuch kuch jagah galti tha minor mistake wo bus sudhra hua hai
// niche wal code me
//
//package com.amit;
//
//import java.util.Scanner;
//
//public class Cognizant_Q5 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the no.of tickets");
//        int ticket = sc.nextInt();
//
//        if(ticket < 5 || ticket > 40) {
//            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
//            return;
//        }
//
//        System.out.println("Do you want refreshments? (y/n)");
//        boolean refreshments = sc.next().equalsIgnoreCase("y");
//
//        System.out.println("Do you have coupon code? (y/n)");
//        boolean code = sc.next().equalsIgnoreCase("y");
//
//        System.out.println("Enter the circle (k/q)");
//        String circle = sc.next();
//
//        int ticketCost;
//
//        if(circle.equalsIgnoreCase("k"))
//            ticketCost = 75;
//        else if(circle.equalsIgnoreCase("q"))
//            ticketCost = 150;
//        else {
//            System.out.println("Invalid Input");
//            return;
//        }
//
//        double cost = ticket * ticketCost;
//
//        // 10% discount for more than 20 tickets
//        if(ticket > 20)
//            cost -= cost * 0.10;
//
//        // 2% coupon discount
//        if(code)
//            cost -= cost * 0.02;
//
//        // Add refreshments after discounts
//        if(refreshments)
//            cost += ticket * 50;
//
//        System.out.printf("Ticket cost: %.2f", cost);
//    }
//}
