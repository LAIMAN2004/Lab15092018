package org.istep.qa;

public class zadanie6 {
    public static void main(String[] args) {
        String begin = "9:25:25";
        String end = "17:21:58";

        String[] s = begin.split(":");
        int hour = Integer.valueOf(s[0]);
        int min = Integer.valueOf(s[1]);
        int sec = Integer.valueOf(s[2]);
        int start = hour * (60 * 60) + (min * 60) + sec;
        s = end.split(":");
        hour = Integer.valueOf(s[0]);
        min = Integer.valueOf(s[1]);
        sec = Integer.valueOf(s[2]);
        int finish = hour * (60 * 60) + (min * 60) + sec;
        int result = finish - start;
        hour = result / 60 / 60;
        min = result / 60 % 60;
        sec = result % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}
