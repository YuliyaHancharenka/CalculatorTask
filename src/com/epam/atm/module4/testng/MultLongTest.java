package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongTest extends BaseCalculatorTest {

    @Test(description = "Check long multiplication method", dataProvider = "MultLongDataProvider")
    public void testLongMult(long a, long b, long expected) {
        long mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected, "Method 'testLongMult' returned not expected value: ");
    }

    @DataProvider(name = "MultLongDataProvider")
    public Object[][] multLongDataProvider() {
        return new Object[][]{
                {1, 1, 1},
                {5, -2, -10},
                {-5, -2, 10}
        };
    }
}
