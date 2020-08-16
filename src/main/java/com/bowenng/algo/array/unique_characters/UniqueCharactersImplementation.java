package com.bowenng.algo.array.unique_characters;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersImplementation implements UniqueCharacters {

    @Override
    public boolean areCharactersUnique(char[] chars) {
        if (chars == null || chars.length == 0) {
            return true;
        }

        Set<Character> visited = new HashSet<>();

        for (char character: chars) {
            if (visited.contains(character)) {
                return false;
            }

            visited.add(character);
        }
        return true;
    }
}