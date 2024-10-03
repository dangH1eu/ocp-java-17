package org.example.building_blocks;

import org.example.Main;

public class InitializingVariables {

    public static int notValid() {
        int y = 10;
        int x;
        x = 3;
        int z;
        int reply = x + y;
        return reply;
    }

    public static void findAnswer(boolean check) {}
    public static void checkAnswer(){
        boolean value;
//        findAnswer(value);
    }
    public static class Zoo{
//        var tricky = "Holla";

        public void whatTypeAmI() {
            var name = "Dinosaur";
            var size = 100;
            System.out.println(name);
            System.out.println(size);
        }
    }
    public static void reassignment(){
        var number = 7;
        number = 2;
//        number = "six";
    }
    public static void doesThisCompile(boolean check) {
//        var question;
//        question = 1;
//        var answer;
//        if (check) {
//            answer = 2;
//        }
//        else {
//            answer = 3;
//        }
//        System.out.println(answer);
    }
    public static void twoTypes() {
//        int a, var b = 3;
//        var n = null;
    }

//    public static int addition(var a, var b) {
//        return a + b;
//    }


    public static void main(String[] args) {

        Main.hr("Creating Local Variables");
        Main.shr("Final Local Variables");
        final int y = 10;
        int x = 20;
//        y = x + 10;

        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
//        favoriteNumbers = null;

        Main.shr("Uninitialized Local Variables");
        System.out.println(notValid());

        Main.hr("Passing Constructor and Method Parameters");

        Main.hr("Defining Instance and Class Variables");
        Main.hr("Inferring the Type with var");
        Zoo zoo = new Zoo();
        zoo.whatTypeAmI();
        Main.shr("Type Inference of var");
        Main.shr("Examples with var");
    }

}
