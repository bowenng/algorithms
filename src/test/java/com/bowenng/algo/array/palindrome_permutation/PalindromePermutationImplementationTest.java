package com.bowenng.algo.array.palindrome_permutation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationImplementationTest {

    private static PalindromePermutation solver;

    @BeforeAll
    public static void initializeSolver() {
        solver = new PalindromePermutationImplementation();
    }

    @Test
    public void nullInput() {
        char[] input = null;
        assertTrue(solver.isPalindromePermutation(input), "Should be true if input == null");
    }

    @Test
    public void emptyInput() {
        char[] input = new char[0];
        assertTrue(solver.isPalindromePermutation(input), "Should be true if input.length = 0");
    }

    @Test
    public void permutationOddLength() {
        char[] input = new char[] {'a', 'b' ,'b', 'b', 'a', 'b', '0', 'e','e'};
        assertTrue(solver.isPalindromePermutation(input));
    }

    @Test
    public void permutationWithEvenLength() {
        char[] input = new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd'};
        assertTrue(solver.isPalindromePermutation(input));
    }

    @Test void permutationWithSpaces() {
        char[] input = new char[] {'a', 'b' ,'b', ' ', ' ', ' ', 'b', 'a', 'b', '0', 'e','e'};
        assertTrue(solver.isPalindromePermutation(input));
    }

    @Test void permutationWithCasing() {
        char[] input = new char[] {'a', 'a', 'A', 'B', 'b', 'x', 'x', 'X', 'x'};
        assertTrue(solver.isPalindromePermutation(input));
    }

    @Test
    public void permutationWithSpacesAndCasing() {
        char[] input = new char[] {'a', 'a', ' ','b', ' ', 'B', 'C', 'c', 'D', 'd', ' '};
        assertTrue(solver.isPalindromePermutation(input));
    }

    @Test
    public void nonPalindromePermutation() {
        char[] input = new char[] {'a', 'a', ' ','b', ' ', 'B', 'C', 'c', 'D', 'd', ' ', 'x', 'y'};
        assertFalse(solver.isPalindromePermutation(input));
    }
}