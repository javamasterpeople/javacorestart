/*
Viachaslau
Homework lesson 2
task 16
 */

import java.util.Random;

public class SumMinToMax {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = 0; // сумма элементов между мин и макс
        int maxNumber = 0; // максимально число в массиве
        int minNumber = 0; // минимальное число в массиве
        byte indexMaxNumber = 0; // индекс максимального числа
        byte indexMinNumber = 0; // индекс минимального числа
        int arraySize = rand.nextInt(30); // размерность массива создаваемого
        int [] array = new int [arraySize]; // создаём массив
        // Заполняем массив
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100);
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
        //определим сумму элементов между мин и макс
        if (indexMaxNumber >= indexMinNumber) {
            for (int i = indexMinNumber + 1; i < indexMaxNumber; i++)
                result += array[i];
        }
        else {
            for (int i = indexMinNumber - 1; i > indexMaxNumber; i--)
                result += array[i];
        }

        System.out.println("\nМинимальное число: " + minNumber + " его индекс " + indexMinNumber +
                "\nМаксимальное число: " + maxNumber + " Его индекс " + indexMaxNumber + "\nСумма элементов " +
                "между максимальным и минимальным равна: " + result);
    }
}
