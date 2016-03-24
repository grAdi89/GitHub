package org.softuni;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rectangleArea = a * b;
        System.out.println(rectangleArea);
    }
}
