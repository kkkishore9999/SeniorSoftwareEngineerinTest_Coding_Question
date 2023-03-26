package org.core.questions;
public class Palindrome {
    public static void main(String []args){
        String word = "something";
        String word2 = "tacocat";
        String word3 = "kayak";
        String wrod4 = "madam";
        System.out.println(Palindrome.palindrome(word));
        System.out.println(Palindrome.palindrome(word2));
        System.out.println(Palindrome.palindrome(word3));
        System.out.println(Palindrome.palindrome(wrod4));
    }
    public static String reverse(String word) {
        StringBuffer sb = new StringBuffer(word);
        return sb.reverse().toString();
    }
    public static boolean palindrome(String word) {
        String reverseWord = Palindrome.reverse(word);
        System.out.println("-----------------");
        System.out.println("Forwards: " + word);
        System.out.println("Backward: " + Palindrome.reverse(word));
        return word.equals(reverseWord);
    }
}