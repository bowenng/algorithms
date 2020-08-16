package com.bowenng.algo.array.check_permutation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationImplementationTest {
    private static CheckPermutation solver;

    @BeforeAll
    public static void initializeSolver() {
        solver = new CheckPermutationImplementation();
    }

    @Test
    public void bothInputsAreNull() {
        char[] source = null;
        char[] target = null;
        boolean isPermutation = solver.isPermutation(source, target);
        assertTrue(isPermutation, "Should be true if both source and target are null");
    }

    @Test
    public void onlySourceIsNull() {
        char[] source = null;
        char[] target = new char[] {'a', 'b', 'c'};
        boolean isPermutation = solver.isPermutation(source, target);
        assertFalse(isPermutation, "Should be false when only one of source is null");
    }

    @Test
    public void onlyTargetIsNull() {
        char[] source= new char[] {'x', 'y', 'z'};
        char[] target = null;
        boolean isPermutation = solver.isPermutation(source, target);
        assertFalse(isPermutation, "Should be false when only target is null");
    }


    @Test
    public void permutation() {
        char[] source = new char[] {'a', 'b', 'c', 'a', 'c'};
        char[] target = new char[] {'a', 'a', 'c', 'c', 'b'};
        boolean isPermutation = solver.isPermutation(source, target);

        String message = "Source: " + Arrays.toString(source) +
                " Target: " + Arrays.toString(target) +
                " should be true";
        assertTrue(isPermutation, message);
    }
}