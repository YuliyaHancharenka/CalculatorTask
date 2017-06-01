package com.epam.atm.module4.junit;


import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CosTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI / 4, 1},
                {Math.PI, -1}
        });
    }

    private double a;
    private double expected;

    public CosTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testCos() {
        checkTime();
        Calculator calculator = new Calculator();
        double cos = calculator.cos(a);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value", expected, cos, DELTA);
    }
}
