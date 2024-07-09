package org.example.streams;

import org.example.Main;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreams {
    public static void main(String[] args) {
        Main.hr("Creating Stream Sources");
        Main.shr("Creating Finite Streams");

        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);

        var list = List.of("a","b","c");
        Stream<String> fromList1 = list.stream();

        Main.shr("Creating Infinite Streams");
        Stream<Double> randoms = Stream.generate(() -> Math.random());
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        Stream<Integer> oddNumbersUnder100 = Stream.iterate(1, n->n<100,n->n+2);

        Main.hr("Using Common Terminal Operations");
        Main.shr("Counting");
        Stream<String> s = Stream.of("monkey", "boar", "python");
        System.out.println(s.count());

        Main.shr("Finding the Minimum and Maximum");
        Stream<String> s1 = Stream.of("monkey", "ape", "orangutan");
        Optional<String> min = s1.min((str1,str2) -> str1.length() - str2.length());
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((str1,str2) -> 0);
        System.out.println(minEmpty.isPresent());

        Main.shr("Finding a Value");
        Stream<String> s2 = Stream.of("monkey", "ape", "orangutan");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s2.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        Main.shr("Matching");
        var list1 = List.of("monkey", "3", "buffalo");
        Stream<String> infinite1 = Stream.generate(() -> "buffalo");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list1.stream().anyMatch(pred));
        System.out.println(list1.stream().allMatch(pred));
        System.out.println(list1.stream().noneMatch(pred));
        System.out.println(infinite1.anyMatch(pred));

        Main.shr("Iterating");
        Stream<String> s3 = Stream.of("monkey", "firefly", "Grasshopper");
        s3.forEach((str) -> System.out.println(str));
        Stream<String> s4 = Stream.of("monkey", "firefly", "Grasshopper");
        s4.forEach(System.out::println);

        Main.shr("Reducing");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (str,cha) -> str+cha);
        System.out.println(word);

        Stream<Integer> stream1 = Stream.of(8,2,4);
        System.out.println(stream1.reduce(1,(a,b)->a*b));

        BinaryOperator<Integer> op = (a,b) -> a * b;
        Stream<Integer> empty1 = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElement = Stream.of(3,8,2);

        empty1.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println);
        threeElement.reduce(op).ifPresent(System.out::println);

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        int length = stream2.reduce(0, (i,str) ->i+str.length(), (a,b) -> a + b);
        System.out.println(length);

        Main.shr("Collecting");
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        StringBuilder word1 = stream3.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        );
        System.out.println(word1);

        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream4.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll
        );
        System.out.println(set);

        Stream<String> stream5 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set1 = stream5.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set1);

        Main.hr("Using Common Intermediate Operations");
        Main.shr("Filtering");

        Stream<String> s5 = Stream.of("monkey", "firefly", "Grasshopper");
        s5.filter(x -> x.startsWith("m")).forEach(System.out::println);

        Main.shr("Removing Duplicates");
        Stream<String> s6 = Stream.of("bee", "bee", "bee", "seal");
        s6.distinct().forEach(System.out::println);

        Main.shr("Restricting by Position");
        Stream<Integer> s7 = Stream.iterate(1, n->n+1);
        s7.skip(8).limit(2).forEach(System.out::println);

        Main.shr("Mapping");
        Stream<String> s8 = Stream.of("monkey", "firefly", "Grasshopper");
        s8.map(String::length)
                .forEach(System.out::println);
        Stream<String> s9 = Stream.of("monkey", "firefly", "Grasshopper");
        s9.map(x ->x.length())
                .forEach(System.out::println);

        Main.shr("Using flatMap");
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero,one,two);

        animals.flatMap(m->m.stream())
                .forEach(System.out::println);

        var one1 = Stream.of("Bonobo");
        var two1 = Stream.of("Mama Gorilla", "Baby Gorilla");
        Stream.concat(one1,two1)
                .forEach(System.out::println);

        Main.shr("Sorting");
        Stream<String> s10 = Stream.of("brown_", "bear_");
        s10.sorted()
                .forEach(System.out::print);

        Stream<String> s11 = Stream.of("brown_", "bear_");
        s11.sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

        Main.shr("Taking a Peek");
        Stream<String> stream6 = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream6.filter(x -> x.startsWith("g"))
                .peek(System.out::println).count();
        System.out.println(count);

        Main.hr("Putting Together the Pipeline");
        List<String> list2 = List.of("Leda", "Bobo", "Caloy", "Hiraa");
        list2.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);

        long count1 = Stream.of("goldfish", "finch")
                .filter(x -> x.length()>5)
                .collect(Collectors.toList())
                .stream()
                .count();
        System.out.println(count1);
    }

}
