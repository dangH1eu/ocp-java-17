package org.example.making_decisions;

import org.example.Main;

public class WritingWhileLoops {

    public static void eatCheese(int bites, int room) {
        while(bites > 0 && room > 0) {
            bites--;
            room--;
            System.out.println(bites);
            System.out.println(room);
        }
        System.out.println(bites + " pieces of cheese left");
    }

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 5) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
        System.out.println(counter);

        Main.hr("The while Statement");
        int roomInBelly = 5;
        eatCheese(2,roomInBelly);

        Main.hr("The do/while Statement");
        int lizard = 0;
        do {
            lizard++;
        } while (false);
        System.out.println(lizard);

        Main.hr("Infinite Loops");
        int pen = 2;
        int pigs = 5;
        while(pen < 10) {
            pigs++;
//            System.out.println(pigs);
        }
    }
}
