package lesson2;/*
Viachaslau
Homework lesson 2
task 10
 */

public class Fac {
    public static void main(String[] args) {
        int indexStart = 10;
        int indexEnd = 15;
        long result = countStart(indexStart);
        for (int i = indexStart; i <= indexEnd; i++) {
            result = (long) result * i;
            System.out.printf("Факториал числа " + i + " равен ");
            System.out.printf("%,d", result);
            System.out.println("");
        }
    }

    // подсчёт стартового числа
    static long countStart(int indexStart){
        long result = 1;
        for (int i = 1; i < indexStart; i++){
            result = (long) result * i;
        }
        return result;
    }
}



