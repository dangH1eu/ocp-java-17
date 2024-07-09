package org.example.streams;

import org.example.Main;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ReturningAnOptional {

    public static Optional<Double> average(int... scores) {
        if(scores.length == 0) return Optional.empty();
        int sum = 0;
        for(int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);

    }
    public static void main(String[] args) {

        Main.hr("Creating an Optional");
        System.out.println(average(90,100));
        System.out.println(average());

        Optional<Double> opt = average(90,100);
        if(opt.isPresent())
            System.out.println(opt.get());
        Optional<Double> opt1 = average();
//        System.out.println(opt1.get());

        Optional<Double> opt2 = average(80,100);
        opt2.ifPresent(System.out::println);

        Main.hr("Dealing with an Empty Optional");

        Optional<Double> opt3 = average();
        System.out.println(opt3.orElse(Double.NaN));
        System.out.println(opt3.orElseGet(() -> Math.random()));
//        System.out.println(opt3.orElseThrow());



    }
}
