package org.softuni;


import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        String hexA = Integer.toHexString(a).toUpperCase();
        String binA = Integer.toBinaryString(a);
        int numberOfSpaces = 10;
        String hexASpace = String.format("%" + -numberOfSpaces + "s", hexA);
        String binASpace = String.format("%10s", binA).replace(' ', '0');
        String bSpace = String.format("%" + numberOfSpaces + ".2f", b);
        String cSpace = String.format("%" + -numberOfSpaces +".3f", c);
        System.out.printf("|%s|%s|%s|%s|",hexASpace, binASpace, bSpace, cSpace);
        //if input for floating numbers does not work in the format "11.6" - please try with coma "11,6"

    }
}
