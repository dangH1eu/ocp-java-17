package org.example.streams;

import org.example.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class WorkingWithPrimitiveStreams {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,3,4);
        System.out.println(stream.mapToInt(x -> x).sum());

        IntStream intStream = IntStream.of(1,3,5);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        Main.hr("Creating Primitive Streams");
        DoubleStream oneValue = DoubleStream.of(3.13);
        oneValue.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(4).forEach(System.out::println);
        fractions.limit(4).forEach(System.out::println);

        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::print);

        IntStream range = IntStream.range(1,6);
        range.forEach(System.out::println);

        IntStream rangeClosed = IntStream.range(1,5);
        rangeClosed.forEach(System.out::println);

        Main.hr("Mapping Streams");
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream1 = objStream.mapToInt(s -> s.length());

        List<Integer> integerList = new ArrayList<>();
        IntStream ints = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));


        Main.hr("Using Optional with Primitive Streams");
        IntStream stream2 = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream2.average();
        optional.ifPresent(System.out::println);
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(() -> Double.NaN));

        LongStream longs = LongStream.of(5,10);
        long sum = longs.sum();
        System.out.println(sum);
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min();

        Main.hr("Summarizing Statistics");


    }
}
