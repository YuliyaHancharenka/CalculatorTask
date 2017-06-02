package com.epam.atm.module4.junit;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SumDoubleTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.4, 1.5, 2.9},
                {5.1, -2, 3.1},
                {-5.1, -2, -7.1}
        });
    }

    private double a;
    private double b;
    private double expected;

    public SumDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testDoubleSum() {
        checkTime();
        double sum = calculator.sum(a, b);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value",
                expected, sum, DELTA);
    }
}
