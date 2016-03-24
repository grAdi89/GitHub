package org.softuni;

import java.util.Scanner;

public class PrintACharacterTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int inputToInt = Integer.parseInt(input);
        char a = 'a';

        for (int i = 0; i < inputToInt; i++) {
            System.out.printf("%c ", a);

            for (int j = 0; j <= inputToInt; j++) {

                if (j >= i) {
                    break;
                }
                a++;
                System.out.printf("%c ", a);
            }
            System.out.println();
            a = 'a';
        }

        for (int i = inputToInt - 1; i > 0; i--) {
            System.out.printf("%c ", a);

            for (int j = 1; j < inputToInt - 1; j++) {

                if (j >= i) {
                    break;
                }
                a++;
                System.out.printf("%c ", a);
            }
            System.out.println();
            a = 'a';
        }
    }
}
