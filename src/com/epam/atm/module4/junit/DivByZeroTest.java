package com.epam.atm.module4.junit;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivByZeroTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {121, 0},
                {-21, 0},
                {168898, 0}
        });
    }

    private long a;
    private long b;

    public DivByZeroTest(long a, long b) {
        this.a = a;
        this.b = b;
    }

    @Test(expected = NumberFormatException.class)
    public void testDivByZero() {
        checkTime();
        double divByZero = calculator.div(a, b);
    }
}
