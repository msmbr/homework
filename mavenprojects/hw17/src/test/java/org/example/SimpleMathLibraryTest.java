package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SimpleMathLibraryTest {
    SimpleMathLibrary simpleMathLibrary;

    @BeforeEach
    void beforeEach() {
        simpleMathLibrary = new SimpleMathLibrary();
    }

    @Test
    void add() {
        assertEquals(4, simpleMathLibrary.add(2, 2));
    }

    @Test
    void minus() {
        assertEquals(4, simpleMathLibrary.minus(6, 2));
    }

}