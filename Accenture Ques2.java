package com.amit;

import java.util.Scanner;

public class Accenture_Q2
{
    public static void main(String[] args) {
      /*  The Binary number system only uses two digits, 0 and 1 and number system can be called binary string.
       You are required to implement the following function:


        int OperationsBinaryString(char* str);
        The function accepts a string str as its argument. The string str consists of binary digits
        separated with an alphabet as follows:

       – A denotes AND operation
       – B denotes OR operation
       – C denotes XOR Operation
        You are required to calculate the result of the string str, scanning the string to right.
        taking one operation at a time, and return the same.
        Note:
        No order of priorities of operations is required
        Length of str is odd
        If str is NULL or None (in case of Python), return -1
        input = str: 1C0C1C1A0B1      output = 1;
       */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(result(str));
    }

    private static int result(String str)
    {
        if(str.isEmpty())
        {
            return -1;
        }
        int res = str.charAt(0)-'0';
        for(int i=1;i<str.length();)
        {
            char prev = str.charAt(i);
            i++;
            if(prev == 'A')
            {
                res = res & (str.charAt(i) - '0');
            }
            else if(prev == 'B')
            {
                res = res | (str.charAt(i) - '0');
            }
            else {
                res = res ^ (str.charAt(i) - '0');

            }
            i++;


        }
        return res;
    }
}
