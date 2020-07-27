package lesson2;/*
Viachaslau
Homework lesson 2
task 7
 */

public class CircleRectangle {
    public static void main(String[] args) {
        double a = 2; // Длина a
        double b = 3; // Длина b
        double r = 2; // радиус кружка

        double resultR = 0;
        resultR = calculatingR(a, b);

        System.out.print("Круглой картонкой радиусом " + r + " закрыть прямоугольное отверстие со сторонами " +
                + a + " и " + b + "  " );

        boolean check = check(resultR, r);

        if (check) {
            System.out.println("МОЖНО");
        } else if (!(check)) {
            System.out.println("НЕЛЬЗЯ");
        }

    }

    // расчёт требуемого минимального радиуса что бы закрыть прямоугольник (По формуле описанной окружности для прямоугольника)
    static double calculatingR (double a, double b){
        double resultR = (Math.sqrt((Math.pow(a,2) + Math.pow(b,2))))/2;
        return resultR;
    }

    // Проверяем можно ли закрыть кружком прямоугольник
    static boolean check(double resultR, double r){
        if (r > resultR){
            return true;
        }
        else{
            return false;
        }
    }

}
