package org.example.lambdas_and_functional_interfaces;

import org.example.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class WorkingWithBuiltinFunctionalInterfaces {


    public static void main(String[] args) {

        Main.hr("Implementing Supplier");
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();

        System.out.println(s3.get());
        System.out.println(s4.get());

        Supplier<ArrayList<String>> s5 = ArrayList::new;
        ArrayList<String> a1 = s5.get();
        System.out.println(a1);

        Main.hr("Implementing Consumer and BiConsumer");

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("GOGO");
        c2.accept("GOGO");

        Map<String,Integer> map = new HashMap<String,Integer>();
        BiConsumer<String,Integer> b1 = map::put;
        BiConsumer<String,Integer> b2 = (k, v) -> map.put(k,v);

        b1.accept("Bill", 2);
        b2.accept("GOGO", 8);

        System.out.println(map);

        Main.hr("Implementing Predicate and BiPredicate");

        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String,String> bp1 = String::startsWith;
        BiPredicate<String,String> bp2 = (s, p) -> s.startsWith(p);

        System.out.println(bp1.test("chicken", "chick"));
        System.out.println(bp2.test("chicken", "chick"));

        Main.hr("Implementing Function and BiFunction");

        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("gogo"));
        System.out.println(f2.apply("gogo"));

        BiFunction<String,String,String> bf1 = String::concat;
        BiFunction<String,String,String> bf2 = (string, toAdd) ->string.concat(toAdd);

        System.out.println(bf1.apply("kill","bill"));
        System.out.println(bf2.apply("cliff","booth"));

        Main.hr("Implementing UnaryOperator and BinaryOperator");

        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("cezane"));
        System.out.println(u2.apply("cezane"));

        BinaryOperator<String> bn1 = String::concat;
        BinaryOperator<String> bn2 = (s, p) -> s.concat(p);

        System.out.println(bn1.apply("cezane","zen 3"));
        System.out.println(bn2.apply("cezane","zen 3"));

        Main.hr("Using Convenience Methods on Functional Interfaces");

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        Predicate<String> brownEggs1 = egg.and(brown);
        Predicate<String> otherEggs1 = egg.and(brown.negate());

        Consumer<String> c3 = x -> System.out.print("1: " + x);
        Consumer<String> c4 = x -> System.out.print(",2: " + x);

        Consumer<String> combined = c3.andThen(c4);
        combined.accept("annie");

        Function<Integer, Integer> before = x -> x+1;
        Function<Integer, Integer> after = x -> x*2;

        Function<Integer, Integer> combined1 = after.compose(before);

        Main.hr("Learning the Functional Interfaces for Primitives");
        Main.hr("Functional Interfaces for boolean");

        BooleanSupplier bl1 = () -> true;
        BooleanSupplier bl2 = () -> Math.random()> .5;

        System.out.println(bl1.getAsBoolean());
        System.out.println(bl2.getAsBoolean());

        




    }
}
