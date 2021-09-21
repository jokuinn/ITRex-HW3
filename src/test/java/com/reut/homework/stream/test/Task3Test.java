package com.reut.homework.stream.test;

import com.reut.homework.stream.Task3;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    public void createFilteringStreamShouldReturnIntStream(){
        IntStream evenStream = IntStream.of(1, 15, 5, 6);
        IntStream oddStream = IntStream.of(45, 40, 420, 60);

        List<Integer> expected = Arrays.asList(60, 420);

        assertEquals(expected, Task3.createFilteringStream(evenStream, oddStream).boxed().collect(Collectors.toList()));
    }
}
