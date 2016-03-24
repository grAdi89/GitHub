package org.softuni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (n < m) {
            n ^= m;
            m ^= n;
            n ^= m;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.printf("%d ", list.get(i));
        }
    }
}
