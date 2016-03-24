package org.softuni;


import java.util.ArrayList;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Please enter а different char than а digit when you are finished! :))");

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i <= list.size()-1; i+=2) {
            if (list.size() % 2 != 0) {
                System.out.println("Invalid length");
                break;
            }
            if (list.get(i) % 2 == 0 && list.get(i+1) % 2 == 0) {
                System.out.printf("%d, %d -> both are even \n", list.get(i), list.get(i+1));
            }
            else if (list.get(i) % 2 != 0 && list.get(i+1) % 2 != 0) {
                System.out.printf("%d, %d -> both are odd \n", list.get(i), list.get(i+1));
            }
            else {
                System.out.printf("%d, %d -> different\n", list.get(i), list.get(i+1));
            }
        }

    }
}
