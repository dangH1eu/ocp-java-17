package org.example.collections_and_generics;

import org.example.Main;

import java.util.*;

public class UsingTheListInterface {



    public static void main(String[] args) {
        Main.hr("Creating a List with a Factory");
        String[] array = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

        array[0] = "z";

        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);

        asList.set(0, "x");
        System.out.println(Arrays.toString(array));

        Main.hr("Creating a List with a Constructor");
        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<String>(linked1);

        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>(list1);
        var list3 = new ArrayList<String>(10);

        Main.hr("Working with List Methods");

        List<String> list4 = new ArrayList<>();
        list4.add("SD");
        list4.add(0, "NY");
        list4.set(1, "FL");
        System.out.println(list4.get(0));
        list4.remove("NY");
        list4.remove(0);
//        list4.set(0,"?");
        var number = Arrays.asList(1,2,3);
        number.replaceAll(x ->x*2);
        System.out.println(number);

        Main.hr("Converting from List to an Array");
        List<String> list5 = new ArrayList<>();
        list5.add("pig");
        list5.add("elephant");
        Object[] objectArray = list5.toArray();
        String[] stringArray = list5.toArray(new String[0]);
        list5.clear();
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);




    }

}
