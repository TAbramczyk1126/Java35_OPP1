package org.pythagoreanTheorem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagoeranTest {

    @Test
    void shouldReturnTrueForRectangularTriangle() {
        // given
        double a = 3;
        double b = 4;
        double c = 5;
        boolean expected = true;
        // when
        boolean result = Pythagoeran.rectangularTriangle(a, b, c);
        // then
        assertEquals(expected, result);
    }
}
