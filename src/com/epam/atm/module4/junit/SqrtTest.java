package com.epam.atm.module4.junit;


import com.epam.tat.module4.Calculator;
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
                {16, 4}
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
        Calculator calculator = new Calculator();
        double sqrt = calculator.sqrt(a);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value", expected, sqrt, DELTA);
    }
}
