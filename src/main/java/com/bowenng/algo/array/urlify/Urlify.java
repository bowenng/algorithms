package com.bowenng.algo.array.urlify;

/*
 * Transform every space in chars into %20
 * E.g "I love you" -> "I%20love%20you"
 * Assumptions:
 *  1. chars has enough length to hold output
 *  2. length is always valid
 * Edge cases:
 *  1. Do nothing when chars is null
 */
public interface Urlify {
    /**
     *
     * @param chars characters to urlify, with enough length to hold transformed characters
     * @param length length of chars excluding trailing spaces
     */
    void urlify(char[] chars, int length);
}
