package com.bowenng.algo.array.check_permutation;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutationImplementation implements CheckPermutation {

    @Override
    public boolean isPermutation(char[] source, char[] target) {
        if (source == null && target == null) {
            return true;
        }

        if (source == null || target == null) {
            return false;
        }

        Map<Character, Integer> sourceCounter = countCharacters(source);
        Map<Character, Integer> targetCounter = countCharacters(target);

        return sourceCounter.equals(targetCounter);
    }

    private Map<Character, Integer> countCharacters(char[] chars) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c: chars) {
            if (!counter.containsKey(c)) {
                counter.put(c, 0);
            }
            int previousCount = counter.get(c);
            counter.put(c, previousCount + 1);
        }
        return counter;
    }
}
