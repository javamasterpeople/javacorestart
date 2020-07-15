/*
Viachaslau
Homework lesson 2
task 4
 */

public class ReturnNumber {
    public static void main(String[] args) {
        int numberOriginal = 1234; // input data
        int numberIndex1 = (numberOriginal / 1000) % 10;;
        int numberIndex2 = (numberOriginal / 100) % 10;;
        int numberIndex3 = (numberOriginal / 10) % 10;
        int numberIndex4 = numberOriginal % 10;
        System.out.println(numberIndex4 + "" + numberIndex3 + "" + numberIndex2 + "" + numberIndex1);
    }
}
