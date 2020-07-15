/*
Viachaslau
Homework lesson 2
task 11
 */

public class SimpleNumber {
    public static void main(String[] args) {
        int inputData = 6;
        int counter = 0;

        for (int i = 1; i <= inputData; i++){
            if (inputData % i == 0)
                counter++;
        }
        if (counter == 2)
            System.out.println("Число " + inputData + " является простым !");
        else
            System.out.println("Число " + inputData + " не является простым, к сожалению =(");
    }
}
