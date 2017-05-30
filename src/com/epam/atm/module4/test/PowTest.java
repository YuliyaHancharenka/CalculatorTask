package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTest extends BaseCalculatorTest {
    @Test(groups = "main")
    @Parameters({"a", "b", "expected"})
    public void testPow(double a, double b, double expected) {
        checkTime();
        double pow = calculator.pow(a, b);
        Assert.assertEquals(pow, expected);
    }
}
