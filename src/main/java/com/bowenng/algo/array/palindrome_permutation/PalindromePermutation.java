package com.bowenng.algo.array.palindrome_permutation;

/*
 * Check if input can is a permutation of some palindrome
 * Assumptions:
 *  1. Ignore spaces
 *  2. Ignore cases
 * Edge cases
 *  1. Return true if input == null
 *  2. Return true if input.length == 0
 */
public interface PalindromePermutation {
    boolean isPalindromePermutation(char[] input);
}
