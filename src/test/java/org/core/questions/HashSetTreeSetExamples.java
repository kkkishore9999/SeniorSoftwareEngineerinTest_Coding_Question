package org.core.questions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTreeSetExamples {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // Duplicate element

        System.out.println(set); // Output: [banana, apple] (order not guaranteed)

        Set<String> set1 = new TreeSet<>();
        set1.add("banana");
        set1.add("yak");
        set1.add("apple");
        set1.add("zoom");
        set1.add("cherry");

        System.out.println(set1); // Output: [apple, banana, cherry] (sorted order)


    }
}
