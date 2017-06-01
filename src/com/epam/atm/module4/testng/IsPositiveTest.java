package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseCalculatorTest {

    @Test(description = "Check isPositive method", dataProvider = "IsPositiveDataProvider")
    public void testCos(long a, boolean expected) {
        checkTime();
        boolean isPositive = calculator.isPositive(a);
        Assert.assertEquals(isPositive, expected, "Method 'isPositive' returned not expected value: ");
    }

    @DataProvider(name = "IsPositiveDataProvider")
    public Object[][] isPositiveDataProvider() {
        return new Object[][]{
                {88, true},
                {0, false},
                {-1, false}
        };
    }
}
