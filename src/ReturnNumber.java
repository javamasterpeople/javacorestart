/*
Viachaslau
Homework lesson 2
task 4
 */

import java.sql.SQLOutput;

public class ReturnNumber {
    public static void main(String[] args) {
        int numberOriginal = 123456789; // input data
        System.out.println("Исходное число: " + numberOriginal);
        int [] array = new int [countNumber(numberOriginal)];
        writingNumber(numberOriginal, array);
        print(array);
    }

    // метод подсчёта количества цифр
    static int countNumber (int numberPcs){
        int counter = 0;
        while (numberPcs > 0){
            numberPcs = numberPcs / 10;
            counter ++;
        }
        return counter;
    }


    // метод заполнения массива цифрами
    static void writingNumber (int numberOriginal, int[] array){
        for (int i = 0; numberOriginal > 0; i++){
            int number = numberOriginal % 10;
            array[i] = number;
            numberOriginal = numberOriginal / 10;
        }
    }

    //печать цифр числа в обратной последовательности
    static void print(int [] array){
        System.out.print("Перевёрнутое число: ");
        for(int i: array){
            System.out.print(i);
        }
    }
}
