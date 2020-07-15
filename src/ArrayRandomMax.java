/*
Viachaslau
Homework lesson 2
task 13
 */

import java.util.Random;

public class ArrayRandomMax {
    public static void main(String[] args) {
        Random rand = new Random();
        int maxNumber = 0; // максимально число в массиве
        int arraySize = rand.nextInt(30); // размерность массива создаваемого
        int [] array = new int [arraySize]; // создаём массив
        // Заполняем массив
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100);
        //ищем максимальное и выводим массив
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[" + array[i] + "] ");
            if (array[i] > maxNumber)
                maxNumber = array[i];
        }
        System.out.println("\nНаибольшее число:" + maxNumber);
    }
}
