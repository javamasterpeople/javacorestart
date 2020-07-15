/*
Viachaslau
Homework lesson 2
task 10
 */

public class Fac {
    public static void main(String[] args) {
        byte indexStart = 10;
        byte indexEnd = 15;
        for (int i = indexStart; i <= indexEnd; i++) {
            long result = 1;
            for (int j = 1; j <= i; j++)
                result = (long) result * j;
            System.out.println("Факториал числа " + i + " равен " + result);
        }
    }
}

