package org.minutesSeconds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConverterTest {

    @Test
    void shouldReturnSeconds() {
        //Given
        int minutes = 2;
        int expected = 120;
        //When
        int result = TimeConverter.getSeconds(minutes);
        //Then
        assertEquals(expected, result);
    }
}