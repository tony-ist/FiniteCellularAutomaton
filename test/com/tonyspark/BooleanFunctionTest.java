package com.tonyspark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanFunctionTest
{
    @Test
    void getArity() {
        BooleanFunction function = new BooleanFunction(2);

        assertEquals(2, function.getArity());
    }

    @Test
    void call() {
        BooleanFunction function = new BooleanFunction(2);

        function.setTrue(0, 1);
        function.setTrue(1, 0);
        function.setFalse(1, 0);
        function.setFalse(1, 1);

        assertEquals(false, function.call(0, 0));
        assertEquals(true, function.call(0, 1));
        assertEquals(false, function.call(1, 0));
        assertEquals(false, function.call(1, 1));
    }
}