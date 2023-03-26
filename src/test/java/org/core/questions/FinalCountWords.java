package org.core.questions;

import java.util.HashMap;

public class FinalCountWords {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        String str = "Krishna Krishna kishore kishore kishore kishore Today ? Today is a great great weather !";
        String[] split = str.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            } else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
}
