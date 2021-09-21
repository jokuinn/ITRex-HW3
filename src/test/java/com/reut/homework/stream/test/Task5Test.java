package com.reut.homework.stream.test;

import com.reut.homework.stream.Task5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {
    @Test
    public void sumOfOddNumbersInRangeShouldCalculateOddNumbersInRange() {
        final long expected = 125;

        assertEquals(expected, Task5.sumOfOddNumbersInRange(21, 30));
    }
}
