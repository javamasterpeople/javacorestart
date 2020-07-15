/*
Viachaslau
Homework lesson 2
task 12
 */

public class SumFirst3 {
    public static void main (String [] args){
        int counter = 0;
        int result = 0;
        int n = 100; // input data
        for (int i = 0; i <= n; i++)
            if ((i % 3) == 0) {
                result += i;
                counter++;
            }
        System.out.println("Сумма первых " + n + " чисел делящихся на 3 равна " + result);
    }
}
