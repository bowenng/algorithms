package com.bowenng.algo.array.check_permutation;

/*
 * Check if source is a permutation of target
 * Edge cases:
 *  1. Return true if source and target are null
 *  2. Return false if only one of source and target is null
 */
public interface CheckPermutation {
    boolean isPermutation(char[] source, char[] target);
}
