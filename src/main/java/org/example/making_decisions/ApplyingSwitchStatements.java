package org.example.making_decisions;

import org.example.Main;

public class ApplyingSwitchStatements {
    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }
    }

    public static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.println("Winter");
            case 4, 5, 6:
                System.out.println("Spring");
            default:
                System.out.println("Unknown");
            case 7, 8, 9:
                System.out.println("Summer");
            case 10, 11, 12:
                System.out.println("Fall");
        }
    }

    public static final int getCookies() {
        return 4;
    }

    public static void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();

        switch (numberOfAnimals) {
            case bananas:
//            case apples:
//            case getCookies():
//            case cookies:
            case 2 * 3:
        }
    }

    public static void printDayOfWeekV2(int day) {
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        Main.hr("The switch Statement");
        int animal = 1;
        switch (animal) {
            case 1, 2:
                System.out.println("Lion");
            case 3:
                System.out.println("Tiger");
        }
        printDayOfWeek(4);

        Main.shr("Exiting with break Statements");
        printSeason(3);

        Main.shr("Determining Acceptable Case Values");
        feedAnimals();

        Main.hr("The switch Expression");
        printDayOfWeekV2(5);

        Main.shr("Returning Consistent Data Types");
        int measurement = 10;
        int size = switch (measurement) {
            case 5 -> 1;
            case 10 -> (short) 2;
            default -> 5;
//            case 20 -> "3"; // DOES NOT COMPILE
//            case 40 -> 4L; // DOES NOT COMPILE
//            case 50 -> null; // DOES NOT COMPILE
        };
        System.out.println(size);

        Main.shr("Applying a case Block");
        int fish = 2;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };
        System.out.println(name);

        Main.shr("Covering All Possible Values");
        int canis = 2;
        String type = switch (canis) {
            case 1 -> "dog";
            case 2 -> "wolf";
            case 3 -> "coyote";
            default -> "invalid data";
        };
        System.out.println(type);


    }
}
