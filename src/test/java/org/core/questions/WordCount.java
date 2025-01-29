package org.core.questions;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        // Example sentence
        String sentence = "Today? Today the weather is so so great!";

        // Count and print the number of words in the sentence
        Map<String, Integer> wordCountMap = countWords(sentence);

        // Print the result
        System.out.println(wordCountMap);
    }

    // Method to count the number of occurrences of each word in the sentence
    public static Map<String, Integer> countWords(String sentence) {
        // Split the sentence by whitespace and punctuation
        String[] words = sentence.split("[\\s!?,.]+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Loop through the words and count the occurrences
        for (String word : words) {
            if (!word.isEmpty()) {
                // Convert word to lowercase to make the counting case-insensitive
                word = word.toLowerCase();
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}