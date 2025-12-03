package com.amit;

import java.util.Scanner;

public class TCS_Q6
{
    /*At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours
    of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times
     in the bunch of balloons.

    Note: If there is more than one colour which is odd in number,
     then the first colour in the array which is present odd number of times is displayed.
     The colours of the balloons can all be either upper case or lower case in the array.
     If all the inputs are even in number, display the message “All are even”.

    Example 1:

        7  -> Value of N
        [r,g,b,b,g,y,y]  -> B[] Elements B[0] to B[N-1], where each input element is sepārated by ṉew line.
        Output :

        r -> [r,g,b,b,g,y,y]  -> “r” colour balloon is present odd number of times in the bunch.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        char[] B = new char[N];
        System.out.println("enter the color of ballons in either lowerCase or upperCase");
        for (int i = 0; i < N; i++)
        {
            B[i] = sc.next().charAt(0);
            System.out.println();
        }
        int[] freq = new int[26];

        for (int i = 0; i < N; i++)
        {
            if(B[i]>='a' && B[i]<='z') {
                freq[B[i] - 'a']++;
            }
            else if (B[i]>='A' && B[i]<='Z')
            {
                freq[B[i]-'A']++;
            }
        }
        for (int i = 0; i < N; i++)
        {
            if(B[i]>='a' && B[i]<='z')
            {
                if(freq[B[i]-'a']%2 != 0)
                {
                    System.out.println(B[i]);
                    return;
                }
            }
            else
            {
                if(freq[B[i]-'A']%2 !=0)
                {
                    System.out.println(B[i]);
                    return;
                }
            }
        }
        System.out.println("All are Even ");
    }
}
