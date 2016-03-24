package org.softuni;


import java.util.ArrayList;
import java.util.Scanner;

public class GetFirstOddOrEvenElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();

        while (sc.hasNextInt()) {
            arrList.add(sc.nextInt());
        }
        String blq = sc.next();
        int count = sc.nextInt();
        String oddEven = sc.next();
        sc.close();

        getOddEven(arrList, count, oddEven);
    }

    public static ArrayList<Integer> getOddEven (ArrayList<Integer> arrList, int count, String oddEven) {

        ArrayList<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < count * 2 && i <= arrList.size() - 1; i++) {
            if (oddEven.equals("odd") && arrList.get(i) % 2 != 0) {
                finalList.add(arrList.get(i));
            }
            else if (oddEven.equals("even") && arrList.get(i) % 2 == 0) {
                finalList.add(arrList.get(i));
            }
        }

        for (int i = 0; i <= finalList.size() - 1; i++) {
            System.out.printf("%d ", finalList.get(i));
        }

        return finalList;
    }
}
