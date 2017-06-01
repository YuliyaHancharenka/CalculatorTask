package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculatorTest {

    @Test(description = "Check cos method", groups = "main", dataProvider = "CosDataProvider")
    public void testCos(double a, double expected) {
        checkTime();
        double cos = calculator.cos(a);
        Assert.assertEquals(cos, expected, "Method 'cos' returned not expected value: ");
    }

    @DataProvider(name = "CosDataProvider")
    public Object[][] cosDataProvider() {
        return new Object[][]{
                {Math.PI / 4, 1},
                {Math.PI, -1}
        };
    }
}
