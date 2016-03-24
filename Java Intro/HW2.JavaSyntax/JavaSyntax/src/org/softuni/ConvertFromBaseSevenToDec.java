package org.softuni;


import java.util.Scanner;


public class ConvertFromBaseSevenToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] decimalNum = sc.nextLine().toCharArray();
        int power = 0;
        int result = 0;

        for (int i = decimalNum.length - 1; i >= 0; i--, power++) {
           result += Character.getNumericValue(decimalNum[i]) * Math.pow(7, power);
        }
        System.out.println(result);
    }
}
