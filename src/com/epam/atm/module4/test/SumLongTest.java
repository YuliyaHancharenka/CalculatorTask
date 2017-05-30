package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumLongTest extends BaseCalculatorTest {

    @Test(groups = "main")
    @Parameters({"a", "b", "expected"})
    public void testLongSum(long a, long b, long expected) {
        checkTime();
        long sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected, "Expected to be equal: " + expected);
    }
}
