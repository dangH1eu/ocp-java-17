package org.example.collections_and_generics;

import org.example.Main;

import java.util.*;

public class SortingData {
    public static class Duck implements Comparable<Duck>{
        private String name;
        private int weight;

        public Duck(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
        public int compareTo(Duck d) {
            return name.compareTo(d.name);
        }

        public Duck(){}
        public Duck(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    public static class Animal implements Comparable<Animal>{
        private int id;
        @Override
        public int compareTo(Animal o) {
            return id - o.id;
        }

    }
    public static class LegacyDuck implements Comparable{

        private String name;
        @Override
        public int compareTo(Object obj) {
            LegacyDuck d = (LegacyDuck) obj;
            return name.compareTo(d.name);
        }
    }
    public static class MissingDuck implements Comparable<MissingDuck> {
        private String name;
        public int compareTo(MissingDuck quack) {
            if(quack == null) {
                throw new IllegalArgumentException("Poorly formed duck!");
            }
            if(this.name == null && quack.name == null)
                return 0;
            else if(this.name == null) return -1;
            else if(quack.name == null) return 1;
            else return name.compareTo(quack.name);
        }
    }

    public static class Product implements Comparable<Product>{
        private int id;
        private String name;
        public int hashCode(){ return id; }
        public boolean equals(Object obj) {
            if(!(obj instanceof Product)) return false;
            var other = (Product) obj;
            return this.id == other.id;
        }
        public int compareTo(Product obj) {
            return this.name.compareTo(obj.name);
        }
    }
    public static class Squirrel {
        private int weight;
        private String species;
        public Squirrel(){}
        public Squirrel(int weight, String species) {
            this.weight = weight;
            this.species = species;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }
    }
    public static class MultiFieldComparator implements Comparator<Squirrel>{
        public int compare(Squirrel s1, Squirrel s2) {
            int result = s1.getSpecies().compareTo(s2.getSpecies());
            if(result != 0) return result;
            return s1.getWeight()-s2.getWeight();
        }
    }

    static record Rabbit(int id) {}



    public static void main(String[] args) {

        Main.hr("Creating a Comparable Class");
        var ducks= new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
        System.out.println(ducks);


        var a1 = new Animal();
        var a2 = new Animal();
        a1.id = 6;
        a2.id = 2;
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));

        Main.hr("Comparing Data with a Comparator");
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };
        Comparator<Duck> byWeight1 = (d1, d2) ->d1.getWeight()-d2.getWeight();
        Comparator<Duck> byWeight2 = Comparator.comparing(Duck::getWeight);
        var ducks1 = new ArrayList<Duck>();
        ducks1.add(new Duck("Quack", 7));
        ducks1.add(new Duck("Puddles", 10));
        Collections.sort(ducks1);
        System.out.println(ducks1);
        Collections.sort(ducks1,byWeight2);
        System.out.println(ducks1);

        Main.hr("Comparing Multiple Fields");

        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies).thenComparingInt(Squirrel::getWeight);

        Main.hr("Sorting and Searching");
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(1));
        Comparator<Rabbit> c1 = (r1,r2) -> r1.id - r2.id;
        Collections.sort(rabbits,c1);
        Collections.reverse(rabbits);
        System.out.println(rabbits);

        Set<Duck> ducks2 = new TreeSet<>();
        ducks2.add(new Duck("Puddles"));

        Set<Rabbit> rabbits1 = new TreeSet<>((r1,r2)->r1.id-r2.id);
        rabbits1.add(new Rabbit(1));

        Main.hr("Sorting a List");
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.sort((b1,b2)->b1.compareTo(b2));
        System.out.println(bunnies);










    }
}
