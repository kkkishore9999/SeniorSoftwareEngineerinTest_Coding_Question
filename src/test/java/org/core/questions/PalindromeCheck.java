package org.core.questions;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Example words to check
        String word1 = "something";
        String word2 = "tacocat";

        // Check if the words are palindromes
        System.out.println("Is '" + word1 + "' a palindrome? " + isPalindrome(word1));
        System.out.println("Is '" + word2 + "' a palindrome? " + isPalindrome(word2));
    }

    // Method to reverse a string
    public static String reverse(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        return reversedString.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String word) {
        String reversedWord = reverse(word);
        return word.equalsIgnoreCase(reversedWord);
    }
}