package org.softuni;


import java.util.Scanner;

public class ConvertToBaseSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNum = sc.nextInt();
        String base =  Integer.toString(decimalNum, 7);
        System.out.println(base);
    }
}
