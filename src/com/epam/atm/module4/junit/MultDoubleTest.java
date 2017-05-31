package com.epam.atm.module4.junit;


import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultDoubleTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.1, 1, 1.1},
                {5.1, 2, 10.2}
        });
    }

    private double a;
    private double b;
    private double expected;

    private static final double DELTA = 1e-15;

    public MultDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testDoubleMult() {
        checkTime();
        Calculator calculator = new Calculator();
        double pow = calculator.mult(a, b);
        assertEquals(expected, pow, DELTA);
    }
}
