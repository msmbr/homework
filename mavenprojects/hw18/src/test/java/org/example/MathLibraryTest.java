package org.example;

import org.example.libraries.MathLibrary;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {
    @ParameterizedTest
    @MethodSource
    void getAverage(double expectation, List<Integer> passed) {
        assertEquals(expectation, new MathLibrary().getAverage(passed));
    }

    static Stream<Arguments> getAverage() {
        return Stream.of(
                Arguments.of(5.5d, new ArrayList<>(Arrays.asList(5, 6))),
                Arguments.of(5, new ArrayList<>(Arrays.asList(4, 5, 6))),
                Arguments.of(7.25d, new ArrayList<>(Arrays.asList(11, 8, 7, 3)))
        );
    }
}