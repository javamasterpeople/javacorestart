/*
Viachaslau
Homework lesson 2
task 9
 */


public class NumberMultiplication {
    public static void main(String[] args) {
        double result = 1;
        int n = 1;
        int x = (int)(Math.random() * 20);
        while (n <= x){
            result *= n;
            n++;
        }
        System.out.println("Факториал числа " + x + " равен " + result);
    }
}
