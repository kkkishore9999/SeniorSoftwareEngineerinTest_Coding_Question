package org.core.questions;

import java.util.*;

public class CollectionsListSet {
    public static void main(String[] args) {

        // Create a Collection of strings using an ArrayList
        Collection<String> collection = new ArrayList<>();

       // Add elements to the collection
       collection.add("apple");
       collection.add("banana");
       collection.add("cherry");

       // Print the collection
        System.out.println("Collection: " + collection);

        // Check if the collection contains an element
        if (collection.contains("banana")) {
            System.out.println("The collection contains 'banana'.");
        }

        // Remove an element from the collection
        collection.remove("banana");
        System.out.println("Collection after removing 'banana': " + collection);

        // Get the size of the collection
        int size = collection.size();
        System.out.println("Size of the collection: " + size);

        // Check if the collection is empty
        boolean isEmpty = collection.isEmpty();
        System.out.println("Is the collection empty? " + isEmpty);

        // Clear the collection
        collection.clear();
        System.out.println("Collection after clearing: " + collection);
        System.out.println("Is the collection empty now? " + collection.isEmpty());

        //Creating String list
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple"); // Duplicate allowed
        System.out.println("Printing String list "+ list); // Output: [apple, banana, apple]

        //Creating String Set using HashSet
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // Duplicate not added
        System.out.println("Printing String set using HashSet "+ set); // Output: [banana, apple] (Order not guaranteed)
    }
}
