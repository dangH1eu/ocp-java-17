package org.example.building_blocks;

import org.example.Main;

public class DestroyingObjects {

    public static void main(String[] args) {
        Main.hr("Tracing Eligibility");
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}
