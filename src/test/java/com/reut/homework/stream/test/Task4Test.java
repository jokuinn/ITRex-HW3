package com.reut.homework.stream.test;

import com.reut.homework.stream.Task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4Test {
    @Test
    public void factorialShouldReturnFactorialOfNumber(){
        final long expected = 2;
        final long actual = 2;

        assertEquals(expected, Task4.factorial(actual));
    }
}
