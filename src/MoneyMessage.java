/*
Viachaslau
Homework lesson 2
task 8
 */

import java.util.Random;

public class MoneyMessage {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);

        if (x == 1)
            System.out.printf(x + " рубль");
        else if ((x >= 2) && (x <= 4))
            System.out.printf(x + " рубля");
        else
            System.out.printf(x + " рублей");
        }
    }

