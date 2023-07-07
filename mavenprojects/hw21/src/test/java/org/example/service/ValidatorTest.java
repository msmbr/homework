package org.example.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @ParameterizedTest
    @MethodSource
    void isGameMaxNumberCorrect(String input, Boolean expectation) {
        assertEquals(expectation, Validator.isGameMaxNumberCorrect(input));
    }

    static Stream<Arguments> isGameMaxNumberCorrect() {
        return Stream.of(
                Arguments.of("-1", false),
                Arguments.of("asdf", false),
                Arguments.of("5", true)
        );
    }
}