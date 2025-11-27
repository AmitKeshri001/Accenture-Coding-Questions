package com.amit;

import java.util.ArrayList;
import java.util.Scanner;

public class Cognizant_Q12
{
    /*Problem Statement – Mayuri buys “N” no of products from a shop. The shop offers a different percentage of discount
    on each item. She wants to know the item that has the minimum discount offer,
    so that she can avoid buying that and save money.
[   Input Format: The first input refers to the no of items; the second input is the item name, price and discount percentage
    separated by comma(,)]
    Assume the minimum discount offer is in the form of Integer.

    Note: There can be more than one product with a minimum discount.

    Sample Input 1:

        4

    mobile,10000,20

    shoe,5000,10

    watch,6000,15

    laptop,35000,5

    Sample Output 1:

    shoe

    Explanation: The discount on the mobile is 2000, the discount on the shoe is 500, the discount on the watch is 900
     and the discount on the laptop is 1750. So the discount on the shoe is the minimum.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. Of Items : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the product name  , Enter the Price , Enter the percentage of discount \n");
//
        String minProd = "";
        int minProdDis = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            String input = sc.nextLine();
            String[] parts = input.split(",");

            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int discount = Integer.parseInt(parts[2]);

            int discountAmount = (price*discount)/100;

            if(discountAmount<minProdDis)
            {
                minProdDis = discountAmount;
                minProd = name;
                list.clear();
                list.add(name);
            }
            else if (discountAmount==minProdDis)
            {
                list.add(name);
            }
        }
        System.out.println("all the products who have the minimum discount aree : ");

        for(String str:list)
        {
            System.out.println(str);
        }
        return;
    }
}
