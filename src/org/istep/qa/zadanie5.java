package org.istep.qa;

public class zadanie5 {
    public static void main(String[] args) {
        int[] mas = new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);  // НЕ МОГУ ПОНЯТЬ ПОЧЕМУ ОНА НЕ РАБОТАЕТ
        }
        System.out.println(mas[0]);
        System.out.println(mas[1]);
        System.out.println(mas[2]);
        System.out.println("----------------");
        int a = mas[0];
        int b = mas[1];
        int c = mas[2];
        if ((a >= b) && (b >= c)) {
            System.out.println("Это число самое большое" + a);
            if ((b >= a) && (a >= c)) {
                System.out.println("Это число самое большое" + b);
                if ((c >= a) && (a >= b)) {
                    System.out.println("Это число самое большое" + c);
                }
            }
        }
    }
}



