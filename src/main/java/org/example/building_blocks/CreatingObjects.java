package org.example.building_blocks;

import org.example.Main;

public class CreatingObjects {

    public static class Chick {

        int numEggs = 12;
        String name;

        public Chick() {
            name = "duke";
            System.out.println("in constructor");
        }
        public void Chicken(){}

        {
            System.out.println("This is instance initializer");
        }
    }

    public static class Swan {
        int numberEggs;
    }
    public static class Name {
        String first = "Obc";
        String last = "Cic";
        String full = first + last;
    }

    public static class Egg {
        public Egg(){
            number = 5;
        }
        { number = 4;}
        private int number = 3;
    }

    public static void main(String[] args) {

        Main.hr("Calling Constructors");
        Chick chick = new Chick();
        System.out.println(chick.name);

        Main.hr("Reading and Writing Member Fields");
        Swan mother = new Swan();
        mother.numberEggs = 1;
        System.out.println(mother.numberEggs);

        Name name = new Name();
        System.out.println(name.full);

        Main.hr("Executing Instance Initializer Blocks");
        Chick chick1 = new Chick();

        Main.hr("Following the Order of Initialization");
        Egg egg = new Egg();
        System.out.println(egg.number);






    }
}
