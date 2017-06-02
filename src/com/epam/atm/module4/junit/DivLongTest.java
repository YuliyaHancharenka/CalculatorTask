package com.epam.atm.module4.junit;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DivLongTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {-6, -2, 3},
                {-6666, 2, -3333}
        });
    }

    private long a;
    private long b;
    private long expected;

    public DivLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testLongDiv() {
        checkTime();
        double div = calculator.div(a, b);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value",
                expected, div, DELTA);
    }
}
