package org.softuni;


import java.util.*;

public class GhettoNumeralSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        List<String> stringList = new ArrayList<String>();

        for (char element:charArray) {

            switch (element) {
                case '0': stringList.add("Gee");
                    break;
                case '1': stringList.add("Bro");
                    break;
                case '2': stringList.add("Zuz");
                    break;
                case '3': stringList.add("Ma");
                    break;
                case '4': stringList.add("Duh");
                    break;
                case '5': stringList.add("Yo");
                    break;
                case '6': stringList.add("Dis");
                    break;
                case '7': stringList.add("Hood");
                    break;
                case '8': stringList.add("Jam");
                    break;
                case '9': stringList.add("Mack");
                    default:
                        break;
            }
        }
        String inTheGhetto = String.join("", stringList);
        System.out.println(inTheGhetto);
    }
}
