package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongTest extends BaseCalculatorTest {

    @Test(description = "Check long multiplication method", dataProvider = "MultLongDataProvider")
    public void testLongMult(long a, long b, long expected) {
        long mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected, "Expected to be equal: " + expected);
    }

    @DataProvider(name = "MultLongDataProvider")
    public Object[][] multLongDataProvider() {
        return new Object[][]{
                {10, 2, 20},
                {8, 1, 8}
        };
    }
}
