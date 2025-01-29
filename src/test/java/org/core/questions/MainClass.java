package org.core.questions;

public class MainClass {
    public static void main(String[] args) {
        // String inside the main class
        String myString = "I love Java";
        // String inside the main class
        String myString1 = "I love Java and Italian pizza in America";
        printString("Using outside Method " + myString);
        printString("Using outside Method str2 print " + myString1);
        // Calling the method to count the words in the sentence
        int wordCount = countWords(myString);

        // Printing the word count
        System.out.println("Word count:"+" inputted str ' "+ myString +" '  Method return results"+ wordCount);
        // Calling the method to count the words that start with 'I' and/or end with 'a'
        int count = countSpecialWords(myString1);
        // Printing the count
        System.out.println("Count of words starting with 'I' and/or ending with 'a': " + count);
    }

    // Method outside the main method to count the words in a sentence
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Split the string by spaces to count the words
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    // Method outside the main method to print the string
    public static void printString(String str) {
        System.out.println(str);
    }
    // Method outside the main method to count words that start with 'I' and/or end with 'a'
    public static int countSpecialWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Split the string by spaces to get individual words
        String[] words = str.trim().split("\\s+");
        int count = 0;

        // Loop through each word and check the conditions
        for (String word : words) {
            // Convert the word to lower case to ignore case
            String lowerCaseWord = word.toLowerCase();

            // Check if the word starts with 'i' or ends with 'a'
            if (lowerCaseWord.startsWith("i") || lowerCaseWord.endsWith("a")) {
                count++;
            }
        }
        return count;
    }
}