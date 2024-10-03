package org.example.exceptions_and_localization;

import org.example.Main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AutomatingResourceManagement {
    public static void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static void readFileV2(String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class MyFileClass implements AutoCloseable {
        private final int num;

        public MyFileClass(int num) {
            this.num = num;
        }

        @Override
        public void close()  {
            System.out.println("Closing: " + num);
        }
    }
    public static class TurkeyCage implements AutoCloseable {

        @Override
        public void close() {
            System.out.println("close gate");
        }
    }
    public static class JammedTurkeyCage implements AutoCloseable {

        @Override
        public void close() throws IllegalStateException {
            throw new IllegalStateException("Cage door does not close");
        }
    }


    public static void main(String[] args) {


        Main.hr("Introducing Try- with- Resources");
//        readFile("zoo.txt");
//        readFileV2("myfile.txt");

        Main.hr("Basics of Try- with- Resources");
        Main.shr("Constructing Try- with- Resources Statements");
        try (MyFileClass myFileClass = new MyFileClass(2)) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Main.shr("Declaring Resources");
//        try (MyFileClass is = new MyFileClass(2),
//             os = new MyFileClass(2)){}
//        try (var f = new BufferedInputStream(new FileInputStream("it.txt"))) {} catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Main.shr("Scope of Try- with- Resources");
//        try(Scanner s = new Scanner(System.in)) {
//            s.nextLine();
//        }
//        catch (Exception e) {
//            s.nextInt;
//        }
//        finally {
//            s.nextInt;
//        }

        Main.shr("Following Order of Operations");
        try (MyFileClass bookReader = new MyFileClass(1);
             MyFileClass movieReader = new MyFileClass(2)) {
            System.out.println("Try Block");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Block");
        }

        Main.hr("Applying Effectively Final");
        final var bookReader = new MyFileClass(9);
        MyFileClass movieReader = new MyFileClass(3);
        try (bookReader;
             var tvReader = new MyFileClass(7)) {
            System.out.println("Try Block");
        }
        finally {
            System.out.println("Finally block");
        }

        Main.hr("Understanding Suppressed Exceptions");
        try(var t = new TurkeyCage()) {
            System.out.println("put turkey in");
        }

        try(JammedTurkeyCage t = new JammedTurkeyCage()) {
            System.out.println("put turkey in");
        }
        catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try(JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new IllegalStateException("turkey ran off");
        }
        catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
            for(Throwable t : e.getSuppressed()) {
                System.out.println("suppressed: " + t.getMessage());
            }
        }

//        try(JammedTurkeyCage t = new JammedTurkeyCage()) {
//            throw new RuntimeException("turkey ran off");
//        }
//        catch (IllegalStateException e) {
//            System.out.println("caught: " + e.getMessage());
//        }

//        try(JammedTurkeyCage t = new JammedTurkeyCage()) {
//            throw new IllegalStateException("turkey ran off");
//        }
//        finally {
//            throw new RuntimeException("we couldn't find them");
//
//        }



    }
}
