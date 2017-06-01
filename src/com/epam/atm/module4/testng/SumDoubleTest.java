package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseCalculatorTest {

    @Test(description = "Check double sum method")
    @Parameters({"a", "b", "expected"})
    public void testDoubleSum(double a, double b, double expected) {
        checkTime();
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected, "Method 'testDoubleSum' returned not expected value: ");
    }
}
