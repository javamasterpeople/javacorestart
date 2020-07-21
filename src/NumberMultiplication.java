/*
Viachaslau
Homework lesson 2
task 9
 */


import java.util.Random;

public class NumberMultiplication {
    public static void main(String[] args) {
        Random rand = new Random();
        long result = 1;
        int n = 1;
        int x = rand.nextInt(20);
        while (n <= x){
            result *= (int)n;
            n++;
        }
        System.out.print("Факториал числа " + x + " равен ");
        System.out.printf("%,d", result);
    }
}
