package org.core.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoutTheLetters {
    public static void main(String []args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a String");
        String input = reader.nextLine();
        System.out.println("word "+input+" character count as below");
        letterCount(input);
    }
    public static void letterCount(String s){
        Map<String, Integer> map = new HashMap();
        for (int i=1; i<s.length()+1; i++){
            String c = "" + s.charAt(i-1);
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("MAP: " + map);
    }
}


