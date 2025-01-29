package org.core.questions;

import java.util.ArrayList;
import java.util.List;

public class NumberGame {
    public List<Integer> subtractTheEvenNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                result.add(number - 1);
            } else {
                result.add(number);
            }
        }
        System.out.println(result.size());
        return result;
    }
    public List<Integer> doubleTheNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            result.add(number * 2);
        }
        System.out.println(result.size());
        return result;
    }
    public List<Integer> findAllOddNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }
        System.out.println(result.size());
        return result;
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
