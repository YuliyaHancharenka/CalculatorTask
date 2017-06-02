package com.epam.atm.module4.junit;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DivDoubleTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.1, 1, 1.1},
                {6.6, 2.2, 3},
                {-6.2, 2, -3.1}
        });
    }

    private double a;
    private double b;
    private double expected;


    public DivDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testDoubleDiv() {
        checkTime();
        double div = calculator.div(a, b);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value",
                expected, div, DELTA);
    }
}
