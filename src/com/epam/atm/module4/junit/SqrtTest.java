package com.epam.atm.module4.junit;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SqrtTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {121, 11},
                {16.81, 4.1}
        });
    }

    private double a;
    private double expected;

    public SqrtTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testSqrt() {
        checkTime();
        double sqrt = calculator.sqrt(a);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value",
                expected, sqrt, DELTA);
    }
}
