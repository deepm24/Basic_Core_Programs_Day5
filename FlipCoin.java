package org.example;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YEAR ");

        int a = sc.nextInt();

        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
        {
            System.out.println("Year is a Leap Year");
        }
        else
        {
            System.out.println("Year is Not a Leap Year");
        }


    }
}