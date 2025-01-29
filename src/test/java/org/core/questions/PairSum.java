package org.core.questions;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args) {
        // Example array and target sum
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 7;

        // Find and print the pairs that sum up to the target sum
        findPairs(array, targetSum);
    }

    // Method to find pairs that sum up to a given number
    public static void findPairs(int[] array, int targetSum) {
        // Use a HashMap to store the differences
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            int complement = targetSum - num;

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
            }

            // Add the current number to the map
            map.put(num, 1);
        }
    }
}