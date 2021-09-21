package com.reut.homework.stream.test;

import com.reut.homework.stream.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Task1Test {
    @Test
    public void isPrimeShouldReturnTrueWhenNumberIsPrime() {
        assertTrue(Task1.isPrime(29));
    }
}
