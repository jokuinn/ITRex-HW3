package com.reut.homework.stream.test;

import com.reut.homework.stream.Task1;
import com.reut.homework.stream.Task2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    public void createBadWordsDetectingStreamShouldReturnStreamOfBadWords(){
        String text = "I need I learn Stream API";
        List<String> expected = Arrays.asList("I", "learn");

        assertEquals(expected, Task2.createBadWordsDetectingStream(text, expected).collect(Collectors.toList()));
    }
}
