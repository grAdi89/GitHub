package org.softuni;


import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        double sqrt = (a + b + c) / Math.sqrt(c);
        double firstExpression = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)), sqrt);
        double secondExpression = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));
        double average = ((a + b + c) / 3) - ((firstExpression + secondExpression) / 2);
        if (average < 0) {
            average *= (-1);
        }
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f ", firstExpression, secondExpression, average);
    }
}
