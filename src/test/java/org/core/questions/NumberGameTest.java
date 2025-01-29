package org.core.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumberGameTest {
    private NumberGame numberGame;

    @BeforeEach
    void setup() {
        numberGame = new NumberGame();
    }

    @Test
    void findAllOddNumbers() {
        // Given: You have a list of numbers
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When: You find all the odd numbers
        List<Integer> actual = numberGame.findAllOddNumbers(numbers);

        // Then: Only the odd numbers should be in the list
        List<Integer> expected = List.of(1, 3, 5, 7, 9);
        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    void doubleTheNumbers() {
        // Given: You have a list of numbers
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // When: You double all the numbers
        List<Integer> actual = numberGame.doubleTheNumbers(numbers);

        // Then: All the numbers should be doubled
        List<Integer> expected = List.of(2, 4, 6, 8, 10);
        Assertions.assertEquals(expected, actual);
        System.out.println(expected.size());
        for (int i = 0; i < expected.size(); i++) {
            System.out.println(expected.get(i));
        }
    }

    @Test
    void subtractTheEvenNumbers() {
        // Given: You have a list of numbers
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When: You subtract the even numbers
        List<Integer> actual = numberGame.subtractTheEvenNumbers(numbers);

        // Then: Only the modified numbers should be in the list
        List<Integer> expected = List.of(1, 1, 3, 3, 5, 5, 7, 7, 9, 9);
        Assertions.assertEquals(expected, actual);
    }
}