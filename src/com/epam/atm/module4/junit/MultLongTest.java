package com.epam.atm.module4.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultLongTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {5, 2, 10}
        });
    }

    private long a;
    private long b;
    private long expected;

    public MultLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testLongMult() {
        checkTime();
        Calculator calculator = new Calculator();
        double mult = calculator.mult(a, b);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value", expected, mult, DELTA);
    }
}
