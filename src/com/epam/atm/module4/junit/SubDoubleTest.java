package com.epam.atm.module4.junit;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubDoubleTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1.1, -0.1},
                {-5.1, 2.1, -7.2},
                {-5, -2, -3}
        });
    }

    private double a;
    private double b;
    private double expected;

    public SubDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testDoubleSub() {
        checkTime();
        double sub = calculator.sub(a, b);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value",
                expected, sub, DELTA);
    }
}
