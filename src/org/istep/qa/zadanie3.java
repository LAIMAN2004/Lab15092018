package org.istep.qa;
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        System.out.println("Введи название валюты (Доллар, Евро, Рубль, Гривна, Юань)");
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        switch (w) {
            case "Доллар": {
            }
            System.out.println("На сегодняшний день все хреново, курс равет 2,15");
            break;
            case "Евро": {
            }
            System.out.println("На сегодняшний день все хреново, курс равет 2,56");
            break;
            case "Рубль": {
            }
            System.out.println("На сегодняшний день все хреново, курс равет 3,05");
            break;
            case "Гривна": {
            }
            System.out.println("На сегодняшний день все хреново, курс равет 5,16");
            break;
            case "Юань": {
            }
            System.out.println("На сегодняшний день все хреново, курс равет 0,16");
            break;
            default: {
                System.out.println("НЕЗАКОННЫЕ ВАЛЮТНЫЕ ОПЕРАЦИИ НАКАЗУЕМЫ");

            }
        }


    }
}

