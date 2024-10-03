package org.example.building_blocks;

import org.example.Main;


public class ManagingVariableScope {

    public static void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    public static void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
//        System.out.println(teenyBit);
//        System.out.println(bitesOfCheese);
    }

    public static void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
    public static class Mouse {
        final static int MAX_LENGTH = 5;
        int length;
        public void grow(int inches) {
            if(length < MAX_LENGTH) {
                int newSize = length + inches;
                length = newSize;
                System.out.println(length);
            }
        }
    }

    public static void main(String[] args) {
        Main.hr("Limiting Scope");
        eatIfHungry(true);

        Main.hr("Tracing Scope");
        eatMore(true, 11);

        Main.hr("Applying Scope to Classes");
        Mouse m = new Mouse();
        m.grow(4);


    }
}
