package org.example.core_apis;

import org.example.Main;

public class UsingTheStringBuilderClass {

    public static void main(String[] args) {
        String alpha = "";
        for(char current = 'a'; current <= 'z'; ++current) {
            alpha += current;
        }
        System.out.println(alpha);

        Main.ehr();

        StringBuilder beta = new StringBuilder();
        for(char current = 'a'; current <= 'z'; ++current) {
            beta.append(current);
        }
        System.out.println(beta);

        Main.hr("Mutability and Chaining");

        StringBuilder sb = new StringBuilder("start");
        sb.append("+engine");
        StringBuilder same = sb.append("+now");

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);


        Main.hr("Creating a StringBuilder");

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        Main.hr("Important StringBuilder Methods");
        Main.shr("Using Common Methods");

        var sb4 = new StringBuilder("Royle with Cheese");
        String sub = sb4.substring(sb4.indexOf("y"), sb4.indexOf("ee"));
        int len = sb4.length();
        char ch1 = sb4.charAt(8);
        System.out.println(sub + " " + len + " " + ch1);

        Main.shr("Appending Values");
        var sb5 = new StringBuilder().append(1).append('c');
        sb5.append("- ").append(true);
        System.out.println(sb5);

        Main.shr("Inserting Data");
        var sb6 = new StringBuilder("Monitor");
        sb6.insert(3,"-");
        sb6.insert(5,"-");
        sb6.insert(9,"-");
        System.out.println(sb6);

        Main.shr("Deleting Contents");
        var sb7 = new StringBuilder("Gentoo");
        sb7.delete(1,3);
        sb7.deleteCharAt(2);
        System.out.println(sb7);

        Main.shr("Replacing Portions");
        var sb8 = new StringBuilder("Kalinux");
        sb8.replace(2,4, "b1");
        System.out.println(sb8);

        var sb9 = new StringBuilder("Kalinux");
        sb9.replace(4,10, "");
        System.out.println(sb9);

        Main.shr("Reversing");
        var sb10 = new StringBuilder("Kangjin");
        sb10.reverse();
        System.out.println(sb10);

    }
}
