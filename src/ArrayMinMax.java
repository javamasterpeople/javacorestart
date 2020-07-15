/*
Viachaslau
Homework lesson 2
task 14
 */

import java.util.Random;

public class ArrayMinMax {
    public static void main(String[] args) {
        Random rand = new Random();
        int maxNumber = 0; // максимально число в массиве
        int minNumber = 0; // минимальное число в массиве
        byte indexMaxNumber = 0; // индекс максимального числа
        byte indexMinNumber = 0; // индекс минимального числа
        int arraySize = rand.nextInt(30); // размерность массива создаваемого
        int [] array = new int [arraySize]; // создаём массив
        // Заполняем массив
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(11);
        maxNumber = array[0];
        minNumber = array[0];
        //ищем максимальное и минимальное и выводим массив
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[" + array[i] + "] ");
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                indexMaxNumber = (byte)i;
            }
            else if (array[i] <= minNumber) {
                minNumber = array[i];
                indexMinNumber = (byte)i;
            }
        }
        System.out.println("\nМинимальная оценка: " + minNumber + " Её индекс " + indexMinNumber +
                "\nМаксимальная оценка: " + maxNumber + " Её индекс " + indexMaxNumber);
    }
}
