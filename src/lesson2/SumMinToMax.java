package lesson2;/*
Viachaslau
Homework lesson 2
task 16
 */

import java.util.Random;

public class SumMinToMax {
    static byte indexMaxNumber = 0; // индекс максимального числа
    static byte indexMinNumber = 0; // индекс минимального числа

    public static void main(String[] args) {
        Random rand = new Random();
        int arraySize = rand.nextInt(30); // размерность массива создаваемого
        int [] array = new int [arraySize]; // создаём массив
        // Заполняем массив
        for (int i = 0; i < array.length; i++) array[i] = rand.nextInt(100);
        foundMinMax (array);
        sumMinToMax (array);
    }

    //определим сумму элементов между мин и макс
    static void sumMinToMax (int[] array) {
        int result = 0; // сумма элементов между мин и макс
        if (indexMaxNumber >= indexMinNumber) {
            for (int i = indexMinNumber + 1; i < indexMaxNumber; i++)
                result += array[i];
        } else {
            for (int i = indexMinNumber - 1; i > indexMaxNumber; i--)
                result += array[i];
        }
        System.out.println("\nСумма элементов " + "между максимальным и минимальным равна: " + result);
    }


    //ищем максимальное и минимальное и выводим массив
    static void foundMinMax (int[] array) {
        int maxNumber = array[0];
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[" + array[i] + "] ");
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                indexMaxNumber = (byte) i;
            } else if (array[i] <= minNumber) {
                minNumber = array[i];
                indexMinNumber = (byte) i;
            }
        }
        System.out.println("\nМинимальное число: " + minNumber + " его индекс " + indexMinNumber +
                "\nМаксимальное число: " + maxNumber + " Его индекс " + indexMaxNumber);
    }
}
