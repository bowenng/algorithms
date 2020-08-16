package com.bowenng.algo.array.one_edit_distance;

/*
 * Check if source and target are one edit distance away
 * i.e if we can use one insert, replace, or delete to turn source into target
 * Edge Cases:
 *  1. Return true if source and target are both null
 *  2. Return false if only one of source and target is null
 */
public interface OneEditDistance {
    boolean isOneEditDistanceAway(char[] source, char[] target);
}
