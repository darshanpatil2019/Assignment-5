package com.bridgelabz.core;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        System.out.println("Enter the year");      // input year of 4 digit integer value
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 400 == 0) && (year % 100 == 0)) || (year % 4 == 0)) {
            System.out.println("It is a leap Year");
        } else
            System.out.println("It is not a leap year");
    }
}


