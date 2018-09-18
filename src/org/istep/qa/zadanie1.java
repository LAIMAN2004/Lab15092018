package org.istep.qa;
import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину ребра куба");
        int a = scanner.nextInt();
        System.out.println("Объем куба равен " + (a*a*a));
        System.out.println("Площадь боковой поверхности куба равена " + (a*a));
    }
}