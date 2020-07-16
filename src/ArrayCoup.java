/*
Viachaslau
Homework lesson 2
task 15
 */

import java.util.Random;

public class ArrayCoup {
    public static void main(String[] args) {
        Random rand = new Random();
        int arraySize = rand.nextInt(20); // размерность массива создаваемого
        int [] array = new int [arraySize]; // создаём массив
        // Заполняем массив
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(1000);

        // распечатываем массив
        System.out.println("Исходный массив:");
        print(array);

        //переворачиваем массив
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // распечатываем массив
        System.out.println("\nПеревёрнутый массив:");
        print(array);
    }

    // распечатываем массив
    static void print (int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.print("[" + array[i] + "] ");
    }
}
