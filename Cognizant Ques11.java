package com.amit;

import java.util.HashSet;
import java.util.Scanner;

public class Cognizant_Q11
{
    /*IIHM institution is offering a variety of courses to students. Students have a facility to check whether
    a particular course is available in the institution. Write a program to help the institution accomplish this task.
     If the number is less than or equal to zero display “Invalid Range”.

    Assume maximum number of courses is 20.

    Sample Input 1:

    Enter no of course: 5

    Enter course names:
    Java
    Oracle
    C++
    Mysql
    Dotnet

    Enter the course to be searched:
    C++

    Sample Output 1:
    C++ course is available

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of course : ");
        int n = sc.nextInt();
        if( n<=0 || n>20)
        {
            System.out.println("Enter at Max 20 courses");
            return;
        }

        System.out.println("Enter the name of course :\n");
        String[] course = new String[n];
        for(int i=0;i<course.length;i++)
        {
            course[i] = sc.next();
        }
        System.out.println("Enter the course to be searched: ");
        String search = sc.next();

//        HashSet<String> set = new HashSet<>();
//        set.add(search);

        for(int i=0;i<course.length;i++)
        {
            if(course[i].equals(search))
            {
                System.out.println(course[i] + " Is present here");
                return;
            }
        }

        System.out.println("Not present here \n");
        return;

    }
}
