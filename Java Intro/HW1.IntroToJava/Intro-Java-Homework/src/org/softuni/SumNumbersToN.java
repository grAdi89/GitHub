package org.softuni;
import java.util.Scanner;

public class SumNumbersToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int inputToInt = Integer.parseInt(input);
        int sum = 0;

        for (int i = 1; i <= inputToInt; i++) {

            sum += i;
        }
        System.out.println(sum);
    }
}
