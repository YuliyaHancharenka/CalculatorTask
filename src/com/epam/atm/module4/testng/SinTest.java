package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BaseCalculatorTest {

    @Test(description = "Check sin method", dataProvider = "SinDataProvider")
    public void testSin(double a, double expected) {
        double sin = calculator.sin(a);
        Assert.assertEquals(sin, expected, DELTA, "Method 'sin' returned not expected value: ");
    }

    @DataProvider(name = "SinDataProvider")
    public Object[][] sinDataProvider() {
        return new Object[][]{
                {Math.PI / 2, 1},
                {Math.PI /4 , Math.sqrt(2) / 2},
                {0, 0},
        };
    }
}
