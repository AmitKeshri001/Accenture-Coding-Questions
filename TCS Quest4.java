package com.amit;

import java.util.Scanner;

public class TCS_Q4
{
    /*A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1)
    . The status (0/1) of a parking space is represented as the element of the matrix.
     The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

    Note :
    RxC- Size of the matrix
    Elements of the matrix M should be only 0 or 1.

    Example 1:
    Input :
        3   -> Value of R(row)
        3   -> value of C(column)
        [0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
        Output :
        3  -> Row 3 has maximum number of 1’s

        Example 2:
        input :
        4 -> Value of R(row)
        3 -> Value of C(column)
        [0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
        Output :
        4  -> Row 4 has maximum number of 1’s

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of col : ");
        int c = sc.nextInt();
        System.out.println("Enter the number of elements Only 0 or 1 : ");
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] != 0 && matrix[i][j] != 1 )
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }
        int ans = 0;
        int max =  -1;
        for (int i=0;i<r;i++)
        {
            int count1 = 0;


            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j] == 1)
                {
                    count1++;
                }
            }
            if(count1>max)
            {
                max = count1;
                ans = i;
            }
        }

        System.out.println(ans+1);
        return;
    }
}
