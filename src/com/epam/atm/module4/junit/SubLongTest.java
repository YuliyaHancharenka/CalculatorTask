package com.epam.atm.module4.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubLongTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 0},
                {5, 2, 3}
        });
    }

    private long a;
    private long b;
    private long expected;

    private static final double DELTA = 1e-15;

    public SubLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testLongSub() {
        checkTime();
        Calculator calculator = new Calculator();
        double pow = calculator.sub(a, b);
        assertEquals(expected, pow, DELTA);
    }
}

