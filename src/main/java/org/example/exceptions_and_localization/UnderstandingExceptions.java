package org.example.exceptions_and_localization;

import org.example.Main;

import java.io.IOException;

public class UnderstandingExceptions {

    public static void fall(int distance) throws IOException {
        if(distance > 10){
            throw new IOException();
        }
    }

    public static void fallV2(int distance) {
        try {
            if(distance > 10){
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fallV3(String input) {
        System.out.println(input.toLowerCase());
    }

    public static class NoMoreCarrotsException extends Exception {}
    public static class Bunny {
        public static void eatCarrot() throws NoMoreCarrotsException {}
    }

    public static class CanNotHopException extends Exception {}

    public static class Hopper {
        public static void hop() throws CanNotHopException{}
    }

    public static class BunnyV2 extends Hopper {
        public static void hop() {
            throw new RuntimeException("cannot hop");
        }
    }


    public static void main(String[] args) {
        Main.hr("Understanding Exception Types");
        Main.shr("Checked Exceptions");
        fallV2(3);
//        fallV2(12);

        Main.shr("Unchecked Exceptions");
//        fallV3(null);
        Main.hr("Throwing an Exception");
        String[] animals = new String[0];
//        System.out.println(animals[0]);
//        throw new Exception("test");

        Main.hr("Calling Methods That Throw Exceptions");
        try {
            Bunny.eatCarrot();
        } catch (NoMoreCarrotsException e) {
            System.out.println("sad rabbit");
        }

        Main.hr("Overriding Methods with Exceptions");
        Main.hr("Printing an Exception");
        try {
            BunnyV2.hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
