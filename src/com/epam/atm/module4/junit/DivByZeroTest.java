package com.epam.atm.module4.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DivByZeroTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {121, 0},
                {16, 0}
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
        Calculator calculator = new Calculator();
        double divByZero = calculator.div(a, b);
    }
}
