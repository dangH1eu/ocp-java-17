package org.example.core_apis;

import org.example.Main;

public class UnderstandingEquality {
    public static void main(String[] args) {
        Main.hr("Comparing equals() and ==");
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two);
        System.out.println(one == three);

        Main.ehr();
        var x = "Nihao";
        var z = "\tNihao\t".trim();
        System.out.println(x.equals(z));

        Main.ehr();
        var x1 = new StringBuilder("Nixao");
        var z1 = new StringBuilder("Nixao");
        System.out.println(x1.equals(z1));
        System.out.println(x1 == z1);

        Main.ehr();
        var x2 = "Mixao";
        var z2 = new StringBuilder("Mixao");
        System.out.println(x2.equals(z2));
//        System.out.println(x2 == z2);

        Main.hr("The String Pool");

        var x3 = "Sihao";
        var z3 = "\tSihao\t".trim();
        System.out.println(x == z);

        Main.ehr();
        var singleString = "nio geely";
        var concat = "nio ";
        concat += "geely";
        System.out.println(singleString == concat);
        System.out.println(singleString.equals(concat));

        Main.ehr();
        var x4 = "byd volvo";
        var y4 = new String("byd volvo");
        System.out.println(x4 == y4);

        Main.ehr();
        var x5 = "honor";
        var y5 = new String("honor").intern();
        System.out.println(x5 == y5);
    }
}
