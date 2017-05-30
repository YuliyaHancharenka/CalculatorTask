package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SinTest extends BaseCalculatorTest {
    @Test(dataProvider = "SinDataProvider")
    @Parameters({"a", "expected"})
    public void testSin(double a, double expected) {
        double sin = calculator.sin(a);
        Assert.assertEquals(sin, expected);
    }


    @DataProvider(name = "SinDataProvider")
    public Object[][] sinDataProvider() {
        return new Object[][]{
                {Math.PI/2, 1},
                {0, 0},
        };
    }
}
