package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculatorTest {
    @Test(groups = "main", dataProvider = "CosDataProvider")
    @Parameters({"a", "expected"})
    public void testCos(double a, double expected) {
        checkTime();
        double cos = calculator.cos(a);
        Assert.assertEquals(cos, expected);
    }

    @DataProvider(name = "CosDataProvider")
    public Object[][] cosDataProvider() {
        return new Object[][]{
                {Math.PI/4, 1},
                {Math.PI, -1}
        };
    }
}
