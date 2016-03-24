package org.softuni;


import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xA = sc.nextInt();
        int yA = sc.nextInt();
        int xB = sc.nextInt();
        int yB = sc.nextInt();
        int xC = sc.nextInt();
        int yC = sc.nextInt();

        int triangleArea = (xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2;
        if (triangleArea < 0) {
            triangleArea *= (-1);
        }
        System.out.println(triangleArea);
    }
}
