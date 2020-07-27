package lesson2;/*
Viachaslau
Homework lesson 2
task 3
 */

public class TimePrinter {
    public static void main(String[] args) {
        int s = 4500;  // 4500 seconds
        inMinute(s);
        inHour(s);
        inDay(s);
        inWeek(s);
    }

    public static void inMinute(int s) {
        int sec = s % 60;
        int m = (s - sec) / 60;
        System.out.println("A:  " + m + " минут " + sec + " секунд ");
    }

    public static void inHour(int s) {
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        System.out.println("B:  " + h + " часов  " + min + " минут  " + sec + " секунд  ");
    }

    public static void inDay(int s) {
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        System.out.println("С:  " + d + " дней " + hour + " часов  " + min + " минут  " + sec + " секунд  ");
    }

    public static void inWeek(int s) {
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day) / 7;
        System.out.println("D:  " + w + " недель " + day + " дней " + hour + " часов  " + min + " минут  " + sec + " секунд  ");
    }
}
