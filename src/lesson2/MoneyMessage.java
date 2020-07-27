package lesson2;/*
Viachaslau
Homework lesson 2
task 8
 */

import java.util.Random;

public class MoneyMessage {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        System.out.println(x + " " + definitionWord (x));
    }
    // определяем нужную форму слова
    static String definitionWord (int x){
        String word;
        if (x <= 20){
            if (x == 1) {
                word = "рубль";
            }
            else if ((x >= 2) && (x <= 4)) {
                word = "рубля";
            }
            else {
                word = "рублей";
            }
        }

        else {
            x = x % 10;
            if (x == 1) {
                word = "рубль";
            }
            else if ((x >= 2) && (x <= 4)) {
                word = "рубля";
            }
            else {
                word = "рублей";
            }
        }
        return word;
    }
    }

