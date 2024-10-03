package org.example.exceptions_and_localization;

import org.example.Main;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HandlingExceptions {
    public static class AnimalsOutForAWalk extends RuntimeException {
    }

    public static class ExhibitClosed extends RuntimeException {
    }

    public static class ExhibitClosedForLunch extends ExhibitClosed {
    }

    private static void seeAnimal() {
        throw new RuntimeException("animal out");
    }

    public static void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) { // first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) { // second catch block
            System.out.print("not today");
        }
    }

    public static void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) { // Subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) { // Superclass exception
            System.out.print("not today");
        }
    }

    public static void visitMonkeysV2() {
        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
//        catch (ExhibitClosedForLunch e) { // DOES NOT COMPILE
//            System.out.print("try back later");
//        }
    }
    public static void visitSnakes() {
        try{
        }
        catch (NumberFormatException e) {
        }
        catch (IllegalArgumentException e) {
        }
        catch (Exception e) {
        }
    }
    public static void visitManatees() {
        try {
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IllegalArgumentException e2) {
//            System.out.println(e1); // DOES NOT COMPILE
        }
    }
    public static void multiCatchBlock() {
        try {
            System.out.println(Integer.parseInt("243"));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("missing or invalid input");
        }
    }

    public static void multiCatchBlockV2() {
        try {
            throw new IOException();
        }
//        catch (FileNotFoundException | IOException p) {}
        catch (IOException p) {}
    }
    public static void explore() {
        try {
            seeAnimal();
            fall();
        } catch (Exception e) {
            eat();
        } finally {
            seeMoreAnimals();
        }
        goHome();
    }
    public static void fall(){}
    public static void eat(){}
    public static void seeMoreAnimals(){}
    public static void goHome(){}

    public static void finallyBlock() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("t");
        } catch (Exception e) {
            sb.append("c");
        } finally {
            sb.append("f");
        }
        sb.append("a");
        System.out.print(sb.toString());
    }



    public static void main(String[] args) {
        Main.hr("Using try and catch Statements");
        Main.hr("Chaining catch Blocks");
//        visitPorcupine();
//        visitMonkeys();
        Main.hr("Applying a Multi-catch Block");
        multiCatchBlock();
        multiCatchBlockV2();
        Main.hr("Adding a finally Block");
        finallyBlock();





    }
}
