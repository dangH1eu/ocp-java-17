package org.example.collections_and_generics;

import org.example.Main;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithGenerics {

    public static class Crate<T>{
        private T contents;
        public T lookInCrate(){
            return contents;
        }
        public void packCrate(T contents) {
            this.contents = contents;
        }
    }
    public static interface Shippable<T>{
        void ship(T t);
    }
    public static class ShippableAbstractCrate<U> implements Shippable<U>{
        public void ship(U t){};
    }
    public static class ShippableCrate implements Shippable{
        public void ship(Object t) {};
    }

    public static class Handler{
        public static <T> void prepare(T t) {
            System.out.println("Preparing " + t);
        }
        public static <T> Crate<T> ship(T t) {
            System.out.println("Shipping " + t);
            return new Crate<T>();
        }
    }
    public static void printList(List<?> list){
        for(Object x: list){
            System.out.println(x);
        }
    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for(Number number: list){
            count += number.longValue();
        }
        return count;
    }
    public static interface Flyer{
        void fly();
    }
    public static class HangGlider implements Flyer{
        public void fly() {}
    }
    public static class Goose implements Flyer{
        public void fly() {}
    }

    public static void addSound(List<? super String> list){
        list.add("quack");
    }


    public static void main(String[] args) {
        Main.hr("Creating Generic Classes");


        Main.hr("Understanding Type Erasure");
        Main.hr("Implementing Generic Interfaces");
        Main.hr("Writing Generic Methods");
        Main.hr("Bounding Generic Types");
        Main.shr("Creating Unbounded Wildcards");
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);

        Main.shr("Creating Upper- Bounded Wildcards");
        List<? extends Number> list = new ArrayList<Integer>();

        Main.shr("Creating Lower-Bounded Wildcards");
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);






    }
}
