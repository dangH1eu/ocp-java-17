package org.example.exceptions_and_localization;

import org.example.Main;

public class RecognizingExceptionClasses {
    public static class Frog {
        public static void hop(String name, Integer jump) {
            System.out.println(name.toLowerCase() + " " + jump.intValue());
        }
    }

    public static void main(String[] args) {
        Main.hr("RuntimeException Classes");
        Main.shr("ArithmeticException");
//        int answer = 11 / 0;

        Main.shr("ArrayIndexOutOfBoundsException");
        int[] countOfMoose = new int[12];
//        System.out.println(countOfMoose[14]);

        Main.shr("ClassCastException");
        String type = "moose";
//        Integer number = (Integer) type;
        Object obj = type;
        Integer number1 = (Integer) obj;

        Main.shr("NullPointerException");
//        Frog.hop(null, 1);

        Main.shr("IllegalArgumentException");
        Main.shr("NumberFormatException");
//        Integer.parseInt("abc");










    }
}
