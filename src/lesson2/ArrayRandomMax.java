package lesson2;/*
Viachaslau
Homework lesson 2
task 13
 */

import java.util.Random;

public class ArrayRandomMax {
    public static void main(String[] args) {
        int [] array = createArray(); // создаём массив
        System.out.println("Сгенерирован массив: ");
        print(array);
        System.out.println("\nМаксимальный элемент массива: " + findMax(array));
    }

    //метод заполнения массива
    static int[] createArray (){
        Random rand = new Random();
        int arraySize = rand.nextInt(30); // размерность массива создаваемого
        int [] array = new int [arraySize]; // создаём массив
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    //метод поиска максимального элемента массива
    static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //печать массива
    static void print (int [] array){
        for(int i: array){
            System.out.print("[" + i + "] ");
        }
    }
}
