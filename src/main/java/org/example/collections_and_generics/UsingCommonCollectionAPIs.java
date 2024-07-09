package org.example.collections_and_generics;

import org.example.Main;

import java.util.*;

public class UsingCommonCollectionAPIs {




    public static void main(String[] args) {
        Main.hr("Using the Diamond Operator");

        List<Integer> list = new ArrayList<Integer>();
        Map<Long,List<Integer>> maplists = new HashMap<>();

        Main.hr("Adding data");
        Collection<String> list1 = new ArrayList<>();
        System.out.println(list1.add("Jack"));
        System.out.println(list1.add("Jack"));

        Collection<String> set1 = new HashSet<>();
        System.out.println(set1.add("Pumkin"));
        System.out.println(set1.add("Pumkin"));

        Main.hr("Removing Data");

        Collection<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add("Hawk");
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("Hawk"));
        System.out.println(birds);

        Main.hr("Counting Elements");

        Collection<String> birds1 = new ArrayList<>();
        System.out.println(birds1.isEmpty());
        System.out.println(birds1.size());
        birds1.add("Hawk");
        birds1.add("Hawk");
        System.out.println(birds1.isEmpty());
        System.out.println(birds1.size());

        Main.hr("Clearing the Collection");

        Collection<String> birds2 = new ArrayList<>();
        birds2.add("Hawk");
        birds2.add("Hawk");
        System.out.println(birds2.isEmpty());
        System.out.println(birds2.size());
        birds2.clear();
        System.out.println(birds2.isEmpty());
        System.out.println(birds2.size());

        Main.hr("Check Contents");

        Collection<String> birds3 = new ArrayList<>();
        birds3.add("Hawk");
        System.out.println(birds3.contains("Hawk"));
        System.out.println(birds3.contains("robin"));

        Main.hr("Removing with Conditions");

        Collection<String> list2 = new ArrayList<>();
        list2.add("Magician");
        list2.add("Assistant");
        System.out.println(list2);
        list2.removeIf(s -> s.startsWith("A"));
        System.out.println(list2);

        Collection<String> set2 = new HashSet<>();
        set2.add("Wand");
        set2.add("");
        set2.removeIf(String::isEmpty);
        System.out.println(set2);

        Main.hr("Iterating");

        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));

        Main.hr("Determining Equality");

        List<Integer> list3 = List.of(1,2);
        List<Integer> list4 = List.of(2,1);

        Set<Integer> set3 = Set.of(1,2);
        Set<Integer> set4 = Set.of(2,1);

        System.out.println(list3.equals(list4));
        System.out.println(set3.equals(set4));
        System.out.println(list3.equals(set3));



    }

}
