package lesson2;/*
Viachaslau
Homework lesson 2
task 14
 */

import java.util.Random;

public class ArrayMinMax {
    public static void main(String[] args) {
        int [] array = createArray(); // создаём массив
        System.out.println("Сформирован массив чисел:");
        print(array);
        int [] arrayResult = findMinMax(array); // Ищем максимальный и минимальный элементы их индексы
        System.out.println("");
        printResult(array, arrayResult);
    }

    //метод заполнения массива
    static int[] createArray (){
        Random rand = new Random();
        int arraySize = rand.nextInt(30); // размерность массива создаваемого
        int [] array = new int [arraySize]; // создаём массив
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
        }
        return array;
    }

    //метод поиска минимального и максимального элемента с индексами
    static int[] findMinMax(int[] array){
        int maxNumber = array[0];
        int minNumber = array[0];
        int [] arrayResult = new int [2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                arrayResult[1] = (byte)i;
            }
            else if (array[i] <= minNumber) {
                minNumber = array[i];
                arrayResult[0] = (byte)i;
            }
        }
        return arrayResult;
    }

    //печать массива
    static void print (int [] array){
        for(int i: array){
            System.out.print("[" + i + "] ");
        }
    }

    //печать результатов
    static void printResult(int[] array, int[] arrayResult){
        System.out.println("Минимальный элемент: " + array[arrayResult[0]] + "  Его индекс: " + arrayResult[0]);
        System.out.println("Максимальный элемент: " + array[arrayResult[1]] + "  Его индекс: " + arrayResult[1]);
    }
}
