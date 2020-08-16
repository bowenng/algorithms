package com.bowenng.algo.array.urlify;

public class UrlifyImplementation implements Urlify {
    @Override
    public void urlify(char[] chars, int length) {
        if (chars == null) {
            return;
        }

        if (chars.length == 0 || length == 0) {
            return;
        }

        // next character to read
        int reader = length - 1;
        // next character to write
        int writer = chars.length - 1;

        while (reader >= 0) {
            char charToWrite = chars[reader];
            if (charToWrite != ' ') {
                chars[writer] = charToWrite;
                reader--;
                writer--;
            } else {
                chars[writer--] = '0';
                chars[writer--] = '2';
                chars[writer--] = '%';
                reader--;
            }
        }
    }
}
