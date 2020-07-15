/*
Viachaslau
Homework lesson 2
task 6
 */

public class NumberCheck1 {
    public static void main(String[] args) {
        int numberOriginal = 127; // Входные данные
        int size = 3; // Количество цифр при сравнении
        int counter = 0; // счётчик в который записываем количество цифр в числе
        boolean even = false; // результат проверки на четность
        boolean sizeTrue = false; // результат проверки на размер числа
        boolean lastDigit7 = false; // результат проверки последней цифры на 7

        even = ((numberOriginal % 2) == 0) ? true : false; // проверка на чётность

        // Подсчёт количества цифр в числе
        for (int tempNumber = numberOriginal;tempNumber > 0 ; counter++) {
            tempNumber /= 10;
        }

        // Проверка на количество цифр равное 3
        if (counter == 3)
            sizeTrue = true;
        else
            sizeTrue = false;

        // Проверка на равенство последней цифры 7
        if ((numberOriginal % 10) == 7)
            lastDigit7 = true;
        else
            lastDigit7 = false;

        System.out.println("Исходное число: " +numberOriginal + "\nПосле всяческих проверок имеем следующее: \nЧисло " +
                "чётное: " + even + "\nЧисло является " + "трёхзначным: " + sizeTrue + "\nПоследняя " +
                "цифра в числе 7: " + lastDigit7);
    }
}
