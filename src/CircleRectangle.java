/*
Viachaslau
Homework lesson 2
task 7
 */

public class CircleRectangle {
    public static void main(String[] args) {
        int a = 2; // Длина a
        int b = 3; // Длина b
        int r = 2;

        System.out.print("Круглой картонкой радиусом " + r + " закрыть прямоугольное отверстие со сторонами " +
                + a + " и " + b );

        // По формуле описанной окружности для прямоугольника проверяем условие
        if (r * r >= (a * a + b * b) / 4)
            System.out.print("   Можно =)");
        else
            System.out.print("   Нельзя =(");
    }
}
