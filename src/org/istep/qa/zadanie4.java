package org.istep.qa;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        System.out.println("Введи трехзначное число");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int s = 0;
        for (int i = 0; i < 3; i++) {
        s += b % 10;
        b /= 10;
    }
        System.out.println(s);
    }
}
