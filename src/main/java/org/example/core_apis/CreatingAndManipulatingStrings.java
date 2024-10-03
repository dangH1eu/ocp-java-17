package org.example.core_apis;

import org.example.Main;

public class CreatingAndManipulatingStrings {


    public static void main(String[] args) {
        String name1 = "Billy";
        String name2 = new String("Billy");
        String name3 = """
                
                Billy
                
                Bill""";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        Main.hr("Concatenating");

        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12
        System.out.println("c" + null); // cnull

        Main.ehr();
        var s = "1";
        s += "2";
        s += 3;
        System.out.println(s);

        Main.hr("Important String Methods");
        Main.shr("Determining the Length");

        var name4 = "animals";
        System.out.println(name4.length());

        Main.shr("Getting a Single Character");
        var name5 = "Wallace";
        System.out.println(name5.charAt(0));
        System.out.println(name5.charAt(3));
        System.out.println(name5.charAt(4));

        Main.shr("Finding an Index");
        var name6 = "hatorihanzo";
        System.out.println(name6.indexOf('a'));
        System.out.println(name6.indexOf("han"));
        System.out.println(name6.indexOf('o',5));
        System.out.println(name6.indexOf('t',3));

        Main.shr("Getting a Substring");
        var name7 = "animals";
        System.out.println(name7.substring(3));
        System.out.println(name7.substring(name7.indexOf('m')));
        System.out.println(name7.substring(3,4));
        System.out.println(name7.substring(3,7));

        Main.shr("Adjusting Case");
        var name8 = "animals";
        System.out.println(name8.toUpperCase());
        System.out.println("ABOCEC".toLowerCase());

        Main.shr("Checking for Equality");

        System.out.println("gogo".equals("GOGO"));
        System.out.println("GOGO".equals("GOGO"));
        System.out.println("gogo".equalsIgnoreCase("GOGO"));

        Main.shr("Searching for Substrings");

        System.out.println("loong".startsWith("l"));
        System.out.println("loong".startsWith("L"));

        System.out.println("loong".endsWith("g"));
        System.out.println("loong".endsWith("o"));

        System.out.println("loong".contains("oo"));
        System.out.println("loong".contains("OO"));

        Main.shr("Replacing Values");

        System.out.println("tiger".replace('i','1'));
        System.out.println("vanguard".replace('g','9'));

        Main.shr("Removing Whitespace");
        System.out.println("\tloong\t".length());
        System.out.println("\tloong\t".strip().length());
        System.out.println("\tlo ong\t".strip().length());
        System.out.println("\tloong\t".trim().length());

        String text1 = " loong\t ";
        System.out.println(text1.stripLeading().length());
        System.out.println(text1.stripTrailing().length());

        Main.shr("Checking for Empty or Blank Strings");
        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true
        System.out.println("".isBlank()); // true

        Main.shr("Formatting Values");

        var name9 = "Hcoisc";
        var orderId = 5;

        System.out.println(String.format("Nihao %s, order %d is ready",name9,orderId));
        System.out.println("Nihao %s, order %d is ready".formatted(name9,orderId));

        var pi = 3.14159265359;
        System.out.format("[%f]\n",pi);
        System.out.format("[%20.10f]\n",pi);
        System.out.format("[%020.10f]\n",pi);
        System.out.format("[%20.5f]\n",pi);
        System.out.format("[%.5f]\n",pi);


        Main.hr("Method Chaining");

        var start = "AniMal    ";
        var trimmed = start.trim();
        var lowercase = trimmed.toLowerCase();
        var result = lowercase.replace('a', 'A');
        System.out.println(result);

        Main.ehr();
        String result1 = "AniMal    ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result1);

        Main.ehr();
        String a1 = "boe";
        String b1 = a1.toUpperCase();
        b1 = b1.replace('E','3').replace('B','5');
        System.out.println(a1);
        System.out.println(b1);


    }
}
