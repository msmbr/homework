package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    @BeforeEach
    void beforeEach() {
        arrayMethods = new ArrayMethods();
    }

    @ParameterizedTest
    @MethodSource
    void getArrAfterLastFour(int[] expectation, int[] passed) throws EmptyArrayException {
        assertArrayEquals(expectation, arrayMethods.getArrAfterLastFour(passed));
    }

    static Stream<Arguments> getArrAfterLastFour() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 7}, new int[]{4, 2, 1, 7}),
                Arguments.of(new int[]{1, 7}, new int[]{2, 4, 1, 7}),
                Arguments.of(new int[]{}, new int[]{2, 4, 1, 4})
        );
    }

    @Test
    void getArrAfterLast_RuntimeException() {
        assertThrows(RuntimeException.class, () -> arrayMethods.getArrAfterLastFour(new int[]{2, 1, 7}));
    }

    @Test
    void getArrAfterLast_EmptyArrayException() {
        assertThrows(EmptyArrayException.class, () -> arrayMethods.getArrAfterLastFour(new int[]{}));
    }

    @ParameterizedTest
    @MethodSource
    void isOneFourOnlyInArr(boolean expectation, int[] passed) {
        assertEquals(expectation, arrayMethods.isOneFourOnlyInArr(passed));
    }

    static Stream<Arguments> isOneFourOnlyInArr() {
        return Stream.of(
                Arguments.of(true, new int[]{1, 1, 1, 4, 4, 1, 4, 4}),
                Arguments.of(false, new int[]{1, 1, 1}),
                Arguments.of(false, new int[]{4, 4, 4, 4}),
                Arguments.of(false, new int[]{1, 4, 4, 1, 4, 3})
        );
    }
}