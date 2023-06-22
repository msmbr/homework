package org.example;

import org.example.libraries.ListConversionLibrary;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListConversionLibraryTest {
    @Test
    void getPairList() {
        List<String> input = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<Pair> expectation = new ArrayList<>();
        expectation.add(new Pair("one", "ONE"));
        expectation.add(new Pair("two", "TWO"));
        expectation.add(new Pair("three", "THREE"));

        assertEquals(expectation, new ListConversionLibrary().getPairList(input));
    }
}