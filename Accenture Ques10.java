package com.amit;

import java.util.Scanner;

public class Accenture_Q10
{
    /*Int OperationChoices(int c, int n, int a , int b )

    The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments.
     Implement the function to return.

        ( a+b ) , if c=1
        ( a – b ) , if c=2
        ( a * b ) ,  if c=3
        (a / b) ,  if c =4
    Assumption : All operations will result in integer output.

        Example:

    Input
    c :1
    a:12
    b:16
    Output:
    Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the c\n");
        int c = sc.nextInt();
        System.out.println("enter the a\n");
        int a = sc.nextInt();
        System.out.println("enter the b\n");
        int b = sc.nextInt();

        System.out.println(ans(c,a,b));
        return;
    }
    private static int ans(int c , int a , int b)
    {
        int ans = 0;
        switch (c)
        {
            case 1 : ans = a+b;
                break;

            case 2 : ans = a-b;
                break;

            case 3 : ans = (int)(a*b);
                break;

            case 4 :
                if(b!=0) {
                    ans = (int) (a / b);
                }
                else
                {
                    System.out.println("not defined");
                    return Integer.MIN_VALUE;
                }
                break;

            default:
                System.out.println("Invalid Number");
        }
        return ans;
    }
}
