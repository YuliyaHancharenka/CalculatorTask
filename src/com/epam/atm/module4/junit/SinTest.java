package com.epam.atm.module4.junit;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SinTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI / 2, 1},
                {-Math.PI / 6, -0.5},
                {0, 0},
        });
    }

    private double a;
    private double expected;

    public SinTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testSin() {
        checkTime();
        double sin = calculator.sin(a);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value",
                expected, sin, DELTA);
    }
}
