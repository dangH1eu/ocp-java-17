package org.example.lambdas_and_functional_interfaces;

import org.example.Main;

import java.util.ArrayList;

public class WritingSimpleLambdas {
    public static void main(String[] args) {

        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false,true));
        animals.add(new Animal("tiger", true,true));
        animals.add(new Animal("eagle", false,true));
        animals.add(new Animal("whale", false,true));


//        print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
//        print(animals, (Animal a) -> {return a.canSwim();});

    }

    private static void print(ArrayList<Animal> animals, CheckTrait checker) {
        for(Animal animal : animals){
            if(checker.test(animal)){
                System.out.print(animal + " ");
            }
            System.out.println();
        }

    }

    public record Animal(String species, boolean canHop, boolean canSwim) {}

    public interface CheckTrait{
        boolean test(Animal a);
    }

    public static class CheckIfHopper implements CheckTrait {
        public boolean test(Animal a) {
            return a.canHop();
        }

    }


}


