/*
Viachaslau
Homework lesson 2
task 17
 */

public class ArrayButterfly {
    public static void main(String[] args) {
        int sizeArray = 5; // размерность массива
        int array[][] = new int[sizeArray][sizeArray]; // создаём массив
        int i, j; // просто переменные

        // создаём верхнюю часть бабочки
        for (i = 0; i < array.length / 2 + 1; i++) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i)))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }

        // создаём нижнюю часть бабочки
        for (i = array.length - 1; i >= array.length / 2; i--) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }

        // печатаем бабочку
        for (i = 0; i < array.length; i++) {
            System.out.println();
            for (j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
        }
    }
}
