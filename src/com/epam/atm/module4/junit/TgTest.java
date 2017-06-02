package com.epam.atm.module4.junit;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TgTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI / 4, 1},
                {-Math.PI / 3, -Math.sqrt(3)},
                {Math.PI, 0}
        });
    }

    private double a;
    private double expected;

    public TgTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testTg() {
        checkTime();
        double tg = calculator.tg(a);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value",
                expected, tg, DELTA);
    }
}
