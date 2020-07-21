/*
Viachaslau
Homework lesson 2
task 6
 */

public class NumberCheck1 {
    public static void main(String[] args) {
        int numberOriginal = 127; // Входные данные
        int size = 3; // Количество цифр при сравнении
        int number = 7;


        System.out.println("Исходное число: " +numberOriginal + "\nПосле всяческих проверок имеем следующее: \nЧисло " +
                "чётное: " + checkEven(numberOriginal) + "\nЧисло является " + "трёхзначным: "
                + checkNumbersPcs(numberOriginal,size) + "\nПоследняя " + "цифра в числе " + number + " "
                + check7(numberOriginal, number));
    }

    // проверка на чётность
    static boolean checkEven (int numberOriginal){
        if ((numberOriginal % 2) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    // проверка на количество цифр
    static boolean checkNumbersPcs(int numberOriginal, int size) {
        int counter = 0; // счётчик в который записываем количество цифр в числе
        for (int tempNumber = numberOriginal; tempNumber > 0; counter++) {
            tempNumber /= 10;
        }

        // Проверка на количество цифр равное 3
        if (counter == size) {
            return true;
        } else {
            return false;
        }
    }

    // проверка является ли последнее число 7
    static boolean check7 (int numberOriginal, int number){
        if ((numberOriginal % 10) == number)
            return true;
        else
            return false;
    }

}
