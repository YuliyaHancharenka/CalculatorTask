package com.epam.atm.module4.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseCalculatorTest {

    @Test(groups = "main")
    @Parameters({"a", "b", "expected"})
    public void testDoubleSum(double a, double b, double expected) {
        checkTime();
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected, "Expected to be equal: " + expected);
    }
}
