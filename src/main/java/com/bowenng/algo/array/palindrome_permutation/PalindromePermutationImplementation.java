package com.bowenng.algo.array.palindrome_permutation;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationImplementation implements PalindromePermutation {
    @Override
    public boolean isPalindromePermutation(char[] input) {
        if (input == null || input.length == 0) {
            return true;
        }

        Map<Character, Integer> counter = countCharacters(input);

        return containsAtMostOneOddCount(counter);
    }

    private Map<Character, Integer> countCharacters(char[] chars) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char c: chars) {
            if (c == ' ') {
                continue;
            }
            c = Character.toLowerCase(c);
            if (!counter.containsKey(c)) {
                counter.put(c, 0);
            }
            int previousCount = counter.get(c);
            counter.put(c, previousCount + 1);
        }

        return counter;
    }

    private boolean containsAtMostOneOddCount(Map<Character, Integer> counter) {
        boolean hasSeenOddCount = false;

        for (Map.Entry<Character, Integer> entry: counter.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                if (hasSeenOddCount) {
                    return false;
                } else {
                    hasSeenOddCount = true;
                }
            }
        }

        return true;
    }
}
