package lesson2;/*
Viachaslau
Homework lesson 2
task 12
 */

public class SumFirst3 {
    public static void main (String [] args){
        int i = 1;
        int counter = 0;
        int result = 0;
        int n = 2; // input data
        do {
            if ((i % 3) == 0) {
                result += i;
                counter++;
            }
            i++;
        }while (counter < n);
        System.out.println("Сумма первых " + n + " чисел делящихся на 3 равна " + result);
    }
}
