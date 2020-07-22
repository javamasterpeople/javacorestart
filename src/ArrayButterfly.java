/*
Viachaslau
Homework lesson 2
task 17
 */

public class ArrayButterfly {
    public static void main(String[] args) {
        int sizeArray = 5; // размерность массива
        int array[][] = new int[sizeArray][sizeArray]; // создаём массив
        create(array);
        print(array);

    }


    //создаём бабочку
    static void create (int [][] array){
        // создаём верхнюю часть бабочки
        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i)))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }

        // создаём нижнюю часть бабочки
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
    }


    //печать бабочки
    static void print (int [][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
        }
    }
}
