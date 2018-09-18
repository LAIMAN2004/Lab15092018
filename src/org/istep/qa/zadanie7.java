package org.istep.qa;
import java.util.Scanner;
public class zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заполни первую строку");
        String a = scanner.nextLine();
        System.out.println("Заполни вторую строку");
        String b = scanner.nextLine();
        if (a.contains(b)) {
            System.out.println("Вторая строка содержится в первой");
        } else {
            System.out.println("Вторая строка не содержится в первой");
        }
    }
}
