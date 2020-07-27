package lesson2;/*
Viachaslau
Homework lesson 2
task 11
 */

public class SimpleNumber {
    public static void main(String[] args) {
        int inputData = 8;

        if (searchResult(inputData))
            System.out.println("Число " + inputData + " является простым !");
        else
            System.out.println("Число " + inputData + " не является простым, к сожалению =(");
    }

    // проверка число на простоту ))
    static boolean searchResult(int inputData){
        int counter = 0;
        for (int i = 1; i <= inputData; i++){
            if (inputData % i == 0) {
                counter++;
            }
            if (counter == 2 && i == inputData){
                return true;
            }
        }
        return false;
    }
}
