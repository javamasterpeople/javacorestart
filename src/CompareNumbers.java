/*
Viachaslau
Homework lesson 2
task 5
 */


public class CompareNumbers {
    public static void main(String[] args) {
        int numberOriginal = 125687; // input data
        int counter = 0; // счётчик в который записываем количество цифр в числе
        boolean result = false;
        // Подсчёт количества цифр в числе
        for (int tempNumber = numberOriginal;tempNumber > 0 ; counter++) {
            tempNumber /= 10;
        }

        int [] array = new int [counter];

        //заполняем массив
        for (int i = 0; i < array.length; i++){
            array[i] = (int) ((numberOriginal / Math.pow(10, counter - 1)) % 10);
            counter--;
        }

        // проверка повторяются ли числа
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    result = true;
                }
            }
        }

        // если цифра одна в числе
        if (array.length == 1){
            result = true;
        }

        System.out.println("Проверяем число: " + numberOriginal);

        if (result){
            System.out.println("Числа не различны");
        }
        else {
            System.out.println("Все числа различны");
        }
    }
}