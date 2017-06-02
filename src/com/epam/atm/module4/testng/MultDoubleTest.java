package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseCalculatorTest {

    @Test(description = "Check double multiplication method", dataProvider = "MultDoubleDataProvider")
    public void testDoubleMult(double a, double b, double expected) {
        double mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected, "Method 'testDoubleMult' returned not expected value: ");
    }

    @DataProvider(name = "MultDoubleDataProvider")
    public Object[][] multDoubleDataProvider() {
        return new Object[][]{
                {1.1, -1, -1.1},
                {5.1, 2, 10.2},
                {-5.1, -2, 10.2}
        };
    }
}
