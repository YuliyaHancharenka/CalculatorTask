package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivLongTest extends BaseCalculatorTest {

    @Test(description = "Check long division method")
    @Parameters({"a", "b", "expected"})
    public void testLongDiv(long a, long b, long expected) {
        checkTime();
        long div = calculator.div(a, b);
        Assert.assertEquals(div, expected, "Expected to be equal: " + expected);
    }
}
