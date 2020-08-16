package com.bowenng.algo.array.urlify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UrlifyImplementationTest {

    private static Urlify solver;

    @BeforeAll
    public static void initializeSolver() {
        solver = new UrlifyImplementation();
    }

    @Test
    public void nullInput() {
        char[] chars = null;
        solver.urlify(chars, 0);
        assertNull(chars, "Shouldn't do anything if input is null");
    }

    @Test
    public void emptyInput() {
        char[] chars = new char[0];
        char[] expected = new char[0];
        solver.urlify(chars, 0);
        assertEquals(Arrays.toString(expected), Arrays.toString(chars), "Empty input should return an empty output");
    }

    @Test
    public void noSpaceInput() {
        char[] chars = new char[] {'B', 'r', 'y', 'a', 'n'};
        char[] expected = new char[] {'B', 'r', 'y', 'a', 'n'};
        solver.urlify(chars, 5);
        assertEquals(Arrays.toString(expected), Arrays.toString(chars), "Shouldn't change an input without spaces");
    }

    @Test
    public void withSpaces() {
        char[] chars = new char[] {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'y', 'o', 'u', ' ', ' ', ' ', ' '};
        char[] expected = new char[] {'I', '%', '2', '0', 'l', 'o', 'v', 'e', '%', '2', '0', 'y', 'o', 'u'};
        solver.urlify(chars, 10);
        assertEquals(Arrays.toString(expected), Arrays.toString(chars), "Should change all spaces to %20");
    }
}