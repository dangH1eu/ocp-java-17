package org.example.collections_and_generics;

import org.example.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class UsingTheMapInterface {
    public static void main(String[] args) {
        Main.hr("Calling Basic Methods");
        Map<String,String> map = new HashMap<>();
        map.put("koala","bambo");
        map.put("lion","meat");
        map.put("giraffe","leaf");

        String food = map.get("koala");
        for(String key : map.keySet()){
            System.out.print(key+",");
        }

        Map<String,String> map1 = new TreeMap<>();
        map1.put("koala","bambo");
        map1.put("lion","meat");
        map1.put("giraffe","leaf");
        String food1 = map1.get("koala");
        for(String key : map1.keySet()){
            System.out.print(key+",");
        }

        System.out.println(map.containsKey("lion"));
        System.out.println(map.containsValue("lion"));
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        Main.hr("Iterating through a Map");

        Map<Integer, Character> map3 = new HashMap<>();
        map3.put(1,'a');
        map3.put(2,'b');
        map3.put(3,'c');
        map3.forEach((k,v) -> System.out.println(v));
        map3.values().forEach(System.out::println);
        map3.entrySet().forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));

        Main.hr("Getting Values Safely");
        Map<Character, String> map4 = new HashMap<>();
        map4.put('x', "spot");
        System.out.println(map4.get('x'));
        System.out.println(map4.getOrDefault('x',""));
        System.out.println(map4.get('y'));
        System.out.println(map4.getOrDefault('y',""));

        Main.hr("Replacing Values");
        Map<Integer,Integer> map5 = new HashMap<>();
        map5.put(1,2);
        map5.put(2,4);
        Integer original = map5.replace(2,10);
        System.out.println(map5);
        map5.replaceAll((k,v) -> k + v);
        System.out.println(map5);

        Main.hr("Putting if Absent");
        Map<String,String> favorites = new HashMap<>();
        favorites.put("Leda", "Needle");
        favorites.put("Ansbach", "Sir");
        favorites.putIfAbsent("Leda", "Knight");
        favorites.putIfAbsent("San", "Oan");
        favorites.putIfAbsent("San", "Woa");
        System.out.println(favorites);

        Main.hr("Merging Data");

        BiFunction<String,String,String> mapper = (v1,v2) -> v1.length() > v2.length() ? v1: v2;

        Map<String,String> favorites1 = new HashMap<>();
        favorites1.put("Leda", "Needle");
        favorites1.put("Renalla", "Princess");

        String leda = favorites1.merge("Leda", "Skyride",mapper);
        String renalla = favorites1.merge("Renalla", "Skyride",mapper);

        System.out.println(favorites1);
        System.out.println(leda);
        System.out.println(renalla);




    }
}
