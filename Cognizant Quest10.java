package com.amit;

import java.util.Scanner;

public class Cognizant_Q10
{
    /*Problem Statement – Chaman planned to choose a four digit lucky number for his car.
    His lucky numbers are 3,5 and 7. Help him find the number,
    whose sum is divisible by  3 or 5 or 7. Provide a valid car number,
    Fails to provide a valid input then display that number is not a valid car number.

    Note : The input other than 4 digit positive number[includes negative and 0] is considered as invalid.

    Refer the samples, to read and display the data.

    Sample Input 1:

    Enter the car no:1234
    Sample Output 1:

    Lucky Number

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car no. : ");
        int n = sc.nextInt();
        if(n<1000 || n>9999)
        {
            System.out.println("Invalid Input !");
            return;
        }

        int sum=0;
        while(n!=0)
        {
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        if(sum%3==0 || sum%5==0 || sum%7==0)
        {
            System.out.println("Lucky Number 👍");
            return;
        }
        else
        {
            System.out.println("that number is not a valid car number !");
        }

    }
}
