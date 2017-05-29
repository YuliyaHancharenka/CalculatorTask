package com.epam.atm.module4.test;


import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivLongTest extends BaseCalculatorTest {
    @Test
    @Parameters({"a", "b", "expected"})
    public void testDiv(long a, long b, long expected) {
        long div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }
}
