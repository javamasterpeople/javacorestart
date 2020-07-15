/*
Viachaslau
Homework lesson 2
task 5
 */


public class CompareNumbers {
    public static void main(String[] args) {
        int numberOriginal = 1234; // input data
        int numberIndex1 = (numberOriginal / 1000) % 10;;
        int numberIndex2 = (numberOriginal / 100) % 10;;
        int numberIndex3 = (numberOriginal / 10) % 10;
        int numberIndex4 = numberOriginal % 10;
        System.out.println("Дано число " + numberOriginal + " цифры числа различны ? " +
                ((numberIndex1 != numberIndex2) && (numberIndex1 != numberIndex3) && (numberIndex1 != numberIndex4)
                && (numberIndex2 != numberIndex3) && (numberIndex2 != numberIndex4) && (numberIndex3 != numberIndex4)));

    }
}
