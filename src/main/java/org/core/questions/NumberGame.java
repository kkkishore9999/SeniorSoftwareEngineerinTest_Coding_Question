package org.core.questions;

import java.util.ArrayList;
import java.util.List;

public class NumberGame {
    public List<Integer> subtractTheEvenNumbers(List<Integer> numbers) {
        numbers = new ArrayList<>();
        System.out.println(numbers.size());
        for (int i = 0; i < numbers.size(); i++) { if(numbers.get(i) % 2 != 0); }
        return numbers;
    }
    public List<Integer> doubleTheNumbers(List<Integer> numbers) {
        numbers = new ArrayList<>();
        System.out.println(numbers.size());
        return numbers;
    }
    public List<Integer> findAllOddNumbers(List<Integer> numbers) {
        numbers = new ArrayList<>();
        System.out.println(numbers.size());
        if(isListOdd(numbers)) {
            System.out.println("List contains only odd elements");
        }
        else{
            System.out.println("list doesn't contains only odd elements");
        }
        return numbers;
    }
    static boolean isListOdd(List<Integer> arr)
    {
        for(int i:arr){
            if(i%2==0)
                return false;
        }
        return true;
    }
}
