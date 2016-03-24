package org.softuni;

import java.util.Scanner;

public class GetAverage {

    public static double calculateAverage(double a, double b, double c) {

        double average = (a + b + c) / 3;
        System.out.printf("%.2f", average);
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        double aDouble = Double.parseDouble(a);
        String b = sc.nextLine();
        double bDouble = Double.parseDouble(b);
        String c = sc.nextLine();
        double cDouble = Double.parseDouble(c);

        calculateAverage(aDouble, bDouble ,cDouble);
    }

}
