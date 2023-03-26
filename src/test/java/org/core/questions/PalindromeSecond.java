package org.core.questions;

import java.util.Scanner;

public class PalindromeSecond {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a String");
        String input = reader.nextLine();
        System.out.println("Is "+input+" a palindrome?: "+input+" "+isPalindrome(input)+" ");
        System.out.println("Please enter another String");
        input = reader.nextLine();
        System.out.println("Is "+input+" a palindrome?: "+input+" "+isPalindrome(input)+" ");
        reader.close();
    }
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty())
        {
            return true;
        }
        char[] arrary = input.toCharArray();
        StringBuilder sb = new StringBuilder (input.length());
        for (int i = input.length() - 1; i >=0;i--) {
            sb.append(arrary[i]);
        }
        String reverseOfString = sb.toString();
        System.out.println("Reverse is"+reverseOfString);
        return input.equals(reverseOfString);
    }
}