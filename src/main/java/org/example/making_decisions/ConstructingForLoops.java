package org.example.making_decisions;

import org.example.Main;

public class ConstructingForLoops {
    public static void printNames(String[] names) {
        for(int counter=0; counter<names.length; counter++)
            System.out.println(names[counter]);
    }
    public static void printNamesV2(String[] names) {
        for(var name : names)
            System.out.println(name);
    }
    public static void main(String[] args) {
        Main.hr("The for Loop");
        for(int i=0; i < 5; i++)
            System.out.println("Value is: "+i);

        Main.ehr();
        int i1;
        for(i1=0; i1 < 10; i1++)
            System.out.println("Value is: "+i1);
        System.out.println(i1);

        Main.shr("Printing Elements in Reverse");
        for (var counter = 5; counter > 0; counter-- ) {
            System.out.print(counter + " ");
        }
        Main.ehr();
        for (var counter = 4; counter >= 0; counter-- ) {
            System.out.print(counter + " ");
        }

        Main.shr("Working with for Loops");
//        for( ; ; ) {
//            System.out.println("Voila");
//        }

        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x + " ");

        Main.ehr();
//        int x = 0;
//        for(int x = 4; x < 5; x++) // DOES NOT COMPILE
//            System.out.print(x + " ");

//        for(int i=0; i<10; i++){
//            i = 0;
//            System.out.println(i);
//        }
//        for(int j=1; j<10; j++) {
//            j++;
//            System.out.println(j);
//
//        }

        Main.hr("The for- each Loop");
        String[] things = {"tes","gow","cow","eow"};
        printNames(things);
        Main.ehr();
        printNamesV2(things);





    }
}
