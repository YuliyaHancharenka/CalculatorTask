package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseCalculatorTest {

    @Test(description = "Check pow method", dataProvider = "PowDataProvider", groups = "main")
    public void testPow(double a, double b, double expected) {
        checkTime();
        double pow = calculator.pow(a, b);
        Assert.assertEquals(pow, expected, DELTA, "Method 'pow' returned not expected value: ");
    }

    @DataProvider(name = "PowDataProvider")
    public Object[][] powDataProvider() {
        return new Object[][]{
                {1, 1, 1},
                {5.1, 2, 26.01},
                {81, 0.5, 9}
        };
    }
}
