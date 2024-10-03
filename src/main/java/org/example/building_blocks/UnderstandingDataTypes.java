package org.example.building_blocks;

import org.example.Main;

public class UnderstandingDataTypes {
    public static void main(String[] args) {
        Main.hr("Using Primitive Types");
        Main.shr("Writing Literals");
//        long max = 2254323983;
        long max1 = 12390123123432L;
        System.out.println(max1);
        Main.shr("Literals and the Underscore Character");
        int million1 = 1000000;
        int million2 = 1_000_000;
        System.out.println(million1);
        System.out.println(million2);

        Main.hr("Using Reference Types");
        String greeting;
        greeting = new String("Voila");

        Main.hr("Distinguishing between Primitives and Reference Types");
        String reference1 = "Aliov";
        int len1 = reference1.length();
//        int bad1 = len1.length();

//        int value1 = null;
        String name1 = null;

        Main.hr("Creating Wrapper Classes");
        int primitive1 = Integer.parseInt("2342");
        Integer wrapper1 = Integer.valueOf("524");

        Double apple = Double.valueOf("200.9921435");
        System.out.println(apple.byteValue());
        System.out.println(apple.intValue());
        System.out.println(apple.doubleValue());

        System.out.println("halo\rhola\nwala");
        System.out.println("ola\r\n");

        Character ch1 = Character.valueOf('b');
        String ch2 = new String("b");
        System.out.println(ch1.equals(ch2));



    }

}
