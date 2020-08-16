package com.bowenng.algo.array.one_edit_distance;

public class OneEditDistanceImplementation implements OneEditDistance {

    @Override
    public boolean isOneEditDistanceAway(char[] source, char[] target) {
        if (source == null && target == null) {
            return true;
        }

        if (source == null || target == null) {
            return false;
        }

        if (Math.abs(source.length - target.length) > 1) {
            return false;
        }

        int sourceIndexToCompare = 0;
        int targetIndexToCompare = 0;
        boolean hasEdited = false;

        while (sourceIndexToCompare < source.length) {
            int sourceChar = source[sourceIndexToCompare];
            int targetChar = target[targetIndexToCompare];

            if (sourceChar != targetChar) {
                if (hasEdited) {
                    return false;
                }
                hasEdited = true;

                if (source.length > target.length) { // Delete
                    sourceIndexToCompare++;
                } else if (source.length == target.length) { // Replace
                    sourceIndexToCompare++;
                    targetIndexToCompare++;
                } else { // Insert
                    targetIndexToCompare++;
                }
            } else {
                sourceIndexToCompare++;
                targetIndexToCompare++;
            }
        }

        return true;
    }
}
