package com.amit;

import java.util.Scanner;

public class Accenture_Q12 {
    /*Int Calculate(int m, int n);

    The function accepts 2 positive integer ‘m’ and ‘n’ as its arguments.
    You are required to calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’
    both inclusive and return the same.
    Note
    0 < m <= n

    Example

    Input:

    m : 12

    n : 50

    Output
    90
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M\n");
        int M = sc.nextInt();
        System.out.println("Enter the value of N\n");
        int N = sc.nextInt();

        System.out.println(Calculate(M, N));
        return;
    }

    private static int Calculate(int M, int N) {
        int sum = 0;

        for (int i = M; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

}