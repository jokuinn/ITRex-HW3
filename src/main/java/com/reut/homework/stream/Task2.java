package com.reut.homework.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
        return Arrays.stream(text.split(" "))
                .filter(badWords::contains)
                .distinct()
                .sorted();
    }
}
