package com.stevenmitchell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void assert_correct_value_returned(){
        int expected = 406;
        int actual = Main.dollarADay(28);

        assertEquals(expected, actual);
    }
}