package com.bowenng.algo.array.one_edit_distance;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OneEditDistanceImplementationTest {
    private static OneEditDistance solver;

    @BeforeAll
    public static void initializeSolver() {
        solver = new OneEditDistanceImplementation();
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(char[] source, char[] target, boolean expected) {
        assertEquals(expected, solver.isOneEditDistanceAway(source, target));
    }

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(null, null, true),
                Arguments.of(new char[0], null, false),
                Arguments.of(null, new char[0], false),
                Arguments.of("I love coding".toCharArray(), "I hate coding".toCharArray(), false),
                Arguments.of("I love coding".toCharArray(), "I live coding".toCharArray(), true),
                Arguments.of("I love coding".toCharArray(), "I loved coding".toCharArray(), true),
                Arguments.of("I love coding".toCharArray(), "I lov coding".toCharArray(), true)
        );
    }
}