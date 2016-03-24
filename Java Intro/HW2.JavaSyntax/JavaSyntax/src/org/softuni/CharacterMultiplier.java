package org.softuni;


import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        multiplier(a, b);
    }

    public static String multiplier (String a, String b) {
        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();
        int result = 0;

        for (int i = 0, j = 0; i <= charArrA.length - 1 && j <= charArrB.length - 1; i++, j++) {
            result += charArrA[i] * charArrB[j];
        }

        if (charArrA.length > charArrB.length) {
            for (int i = charArrB.length; i <=  charArrA.length - 1; i++) {
                result += charArrA[i];
            }
        }
        else if (charArrB.length > charArrA.length) {
            for (int i = charArrA.length; i <=  charArrB.length - 1; i++) {
                result += charArrB[i];
            }
        }

        System.out.println(result);
        return String.valueOf(result);
    }
}
