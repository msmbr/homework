package org.example;

import org.example.libraries.ListFiltersLibrary;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFiltersLibraryTest {

    @Test
    void getLowerCaseAndFourLengthList() {
        List<String> input = new ArrayList<>(Arrays.asList("ABCD", "abcd", "abcD", "CDE", "abc", "abcde", "fghi"));
        List<String> expectation = new ArrayList<>(List.of("abcd", "fghi"));
        assertEquals(expectation, new ListFiltersLibrary().getLowerCaseAndFourLengthList(input));
    }
}