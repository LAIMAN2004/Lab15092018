package org.istep.qa;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();
        String[] w = s.split(" ");
        int b = 0;
        for (int i = 0; i < w.length; i++) {
            if (b < w[i].length())
                b = w[i].length();
        }
        System.out.println("Самое длинное слово состоит из " + b + "символов");
    }
}