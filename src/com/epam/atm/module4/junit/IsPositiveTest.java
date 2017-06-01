package com.epam.atm.module4.junit;


import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsPositiveTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {88, true},
                {0, false},
                {-1, false}
        });
    }

    private long a;
    private boolean expected;

    public IsPositiveTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testIsPositive() {
        checkTime();
        Calculator calculator = new Calculator();
        boolean isPositive = calculator.isPositive(a);
        assertEquals("Method " + testName.getMethodName() + " returned not expected value", expected, isPositive);
    }
}
