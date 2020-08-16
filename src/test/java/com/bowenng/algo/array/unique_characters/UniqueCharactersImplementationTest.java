package com.bowenng.algo.array.unique_characters;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueCharactersImplementationTest {

    private static UniqueCharacters solver;

    @BeforeAll
    public static void initializeSolver() {
        solver = new UniqueCharactersImplementation();
    }

    @Test
    public void nullInput() {
        boolean areUnique = solver.areCharactersUnique(null);
        assertTrue(areUnique, "Return true when char[] == null");
    }

    @Test
    public void emptyInput() {
        boolean areUnique = solver.areCharactersUnique(new char[0]);
        assertTrue(areUnique, "Return true when char[].length == 0");
    }

    @Test
    public void uniqueChars() {
        char[] input = new char[] {'a', 'b', 'c', 'd', 'x', 'y', 'z'};
        boolean areUnique = solver.areCharactersUnique(input);
        assertTrue(areUnique, Arrays.toString(input) + " should be true");
    }

    @Test
    public void repeatedChars() {
        char[] input = new char[] {'a', 'b', 'c', 'd', 'x', 'y', 'a'};
        boolean areUnique = solver.areCharactersUnique(input);
        assertFalse(areUnique, Arrays.toString(input) + " should be false");
    }
}