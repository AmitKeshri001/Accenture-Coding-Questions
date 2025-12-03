package com.amit;

import java.util.Scanner;

public class TCS_Q9
{
    /*The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by
    a number of places down the alphabet.
    For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
    To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for
     the cipher, so that the sender may encrypt and the receiver may decrypt it.
    Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there
    are 26 total alphabets.
    As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9.
     Digits can also be shifted by key places.
    For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, “-”(minus sign) will remain
     as it is. Key value less than 0 should result into “INVALID INPUT”

    Example 1:
    Enter your PlainText: All the best
    Enter the Key: 1

    The encrypted Text is: Bmm uif Cftu

    Write a function CustomCaesarCipher(int key, String message) which will accept plaintext and key as input parameters and returns its cipher text as output.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plain Text\n");
        String text = sc.nextLine();
        System.out.println("Enter the Key\n");
        int key = sc.nextInt();
        if(key < 0)
        {
            System.out.println("Invalid  Input");
            return;
        }

        System.out.println("The encrypted message is : " + solve(text , key));
        return;
    }

    private static String solve(String text, int key)
    {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i) == ' ')
            {
                result.append(' ');
            }
            if(text.charAt(i) >= '0' && text.charAt(i) <= '9')
            {
                int digit = text.charAt(i)-'0';
                digit = (digit+key)%10;  // ye isliye kiye bcoz ye 9+2 = 1 dega naki 11 okk!!
                result.append(digit);
            }
            else if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
            {
//                result.append((char)(text.charAt(i)+key)); // ye wala sahi hia but kya ho agar z + 2 bole ..to ye koi random char dedega .
//              to hame is formula ko na use kar ke ye formula ko use karna hoga taki alphabets wrap around ho sake ..
                char ch = (char) ((text.charAt(i) - 'a' + key) % 26 + 'a');
                result.append(ch);

            }
            else if(text.charAt(i)>='A' && text.charAt(i) <= 'Z')
            {
                char ch = (char) ((text.charAt(i) - 'A' + key) % 26 + 'A');
                result.append(ch);
            }
            else if(text.charAt(i) == '-')
            {
                result.append(text.charAt(i));
            }
        }
        return result.toString();

    }
}
