package org.example.collections_and_generics;

import org.example.Main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingTheSetInterface {
    public static void main(String[] args) {
        Main.hr("Working with Set Methods");
//        Set<Character> letters = Set.of('z','o','o');
//        Set<Character> copy = Set.copyOf(letters);

        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        set.forEach(x-> System.out.println(x));
        set.forEach(System.out::println);

        Set<Integer> set1 = new TreeSet<>();
        boolean b5 = set.add(66);
        boolean b6 = set.add(10);
        boolean b7 = set.add(66);
        boolean b8 = set.add(8);
        set.forEach(x-> System.out.println(x));
        set.forEach(System.out::println);

    }
}
