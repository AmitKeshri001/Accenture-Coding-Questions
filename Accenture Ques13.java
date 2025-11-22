package com.amit;

import java.util.Scanner;

public class Accenture_Q13
{
    /*A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers
     from right-to-left one digit at a time

    You are required to implement the following function.

    Int NumberOfCarries(int num1 , int num2);

    The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments.
    You are required to calculate and return  the total number of carries generated while adding digits
     of two numbers ‘num1’ and ‘ num2’.

    Assumption: num1, num2>=0

    Example:

    Input
    Num 1: 451
    Num 2: 349
    Output
    2

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1\n");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2\n");
        int num2 = sc.nextInt();
        if (num1==0 || num2==0)
        {
            System.out.println("not any carry get as output \n");
        }
        System.out.println(carry(num1 , num2 , 0 , 0 , 0));

        return;
    }

    private static int carry(int num1, int num2 , int carryout , int sum , int count)
    {
        if(num1==0 && num2==0 && carryout==0)
        {
            return count;
        }
        int remain1 = num1%10;
        int remain2 = num2%10;
        int sum1  = remain1+remain2 + carryout;
        int remain4 = sum1%10;
        if(sum1>9)
        {
            count++;
            int remain3 = (sum1/10)%10;
            sum += remain4;
            return carry(num1/10  , num2/10 ,remain3  ,sum  , count);
        }
        else
        {
            sum += remain4;
            return carry(num1/10 , num2/10 , 0 , sum , count);
        }
    }

}
