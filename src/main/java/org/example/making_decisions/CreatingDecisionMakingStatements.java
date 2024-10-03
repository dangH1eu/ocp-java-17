package org.example.making_decisions;

import org.example.Main;

public class CreatingDecisionMakingStatements {

    public static void compareIntegers(Number number) {

//        if(number instanceof Integer) {
//            Integer data = (Integer) number;
//            System.out.println(data.compareTo(5));
//        }

        if(number instanceof Integer data) {
            System.out.println(data.compareTo(5));
        }
    }
    public static void printIntegersGreaterThan5(Number number) {
        if(number instanceof Integer data && data.compareTo(5) > 0)
            System.out.println(data);
    }

//    public static void printIntegersOrNumbersGreaterThan5v2(Number number) {
//        if(number instanceof Integer data || data.compareTo(5)>0)
//            System.out.print(data);
//    }

    public static void printIntegerTwice(Number number) {
        if(number instanceof Integer data) {
            System.out.println(data.intValue());
        }
//        System.out.println(data.intValue());
    }

    public static void printOnlyIntegers(Number number) {
        if(!(number instanceof Integer data))
            return;
        System.out.println(data.intValue());
    }

    public static void main(String[] args) {
        Main.hr("Statements and Blocks");
        // Single statement
        int tickets = 2;
        int patrons = 0;
        if(tickets > 1)
            patrons++;
        if(tickets > 1) {
            patrons++;
        }
        Main.hr("The if Statement");
        int hourOfDay = 20;
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        if(hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }

        Main.hr("The else Statement");
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        Main.hr("Shortening Code with Pattern Matching");
        compareIntegers(2);
        compareIntegers(5);
        compareIntegers(10);

        Main.shr("Pattern Variables and Expressions");
        printIntegersGreaterThan5(3);
        printIntegersGreaterThan5(5);
        printIntegersGreaterThan5(10);

        Main.shr("Subtypes");
        Integer value = 123;
        if(value instanceof Integer) {}
//        if(value instanceof Integer data) {}

        Main.shr("Flow Scoping");
        printIntegerTwice(18);
        printOnlyIntegers(283);
        printOnlyIntegers(1.232);











    }
}
