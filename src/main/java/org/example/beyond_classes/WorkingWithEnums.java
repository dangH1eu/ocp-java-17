package org.example.beyond_classes;

import org.example.Main;

public class WorkingWithEnums {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL;
    }

    public enum SeasonV2 {
        WINTER("Low"), SPRING("Medium"),
        SUMMER("High"), FALL("Medium");
        private final String expectedVisitors;

        private SeasonV2(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }

        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }
    }

    public enum OnlyOne {
        ONCE(true);
        private OnlyOne(boolean b) {
            System.out.print("constructing,");
        }
    }
    public enum SeasonV3 {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SPRING {
            public String getHours() { return "9am-5pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        FALL {
            public String getHours() { return "9am-5pm"; }
        };
        public abstract String getHours();
    }

    public enum SeasonV4 {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        SPRING, FALL;
        public String getHours() { return "9am-5pm"; }
    }

    public static void main(String[] args) {

        Main.hr("Creating Simple Enums");
        Season s1 = Season.SUMMER;
        s1 = Season.FALL;

        Season s2 = Season.FALL;
//        s2 = 1;

        var s = Season.WINTER;
        System.out.println(Season.WINTER);
        System.out.println(s.equals(Season.WINTER));
        System.out.println(s == Season.WINTER);

        Main.shr("Calling the values(), name(), and ordinal() Methods");

        for (var season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        Main.hr("Using Enums in switch Statements");
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.print("Get out the sled!");
                break;
            case SUMMER:
                System.out.print("Time for the pool!");
                break;
            default:
                System.out.print("Is it summer yet?");
        }

        Main.hr("Adding Constructors, Fields, and Methods");
        SeasonV2.SUMMER.printExpectedVisitors();
        SeasonV2.WINTER.printExpectedVisitors();


        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE;
        OnlyOne secondCall = OnlyOne.ONCE;
        System.out.print("end");

        Main.ehr();
        System.out.println(SeasonV3.SPRING.getHours());

        Main.ehr();
        System.out.println(SeasonV4.SPRING.getHours());


    }
}
