package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void hr(String s) {
        String res = String.format("\n[%80s]", s).replace(' ', '-');
        System.out.println(res);
    }
    public static void shr(String s) {
        String res = String.format("\n[%40s]", s).replace(' ', '-');
        System.out.println(res);
    }
    public static void ehr() {
        String res = "\n--------------------------------";
        System.out.println(res);
    }

}