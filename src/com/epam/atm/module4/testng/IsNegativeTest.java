package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseCalculatorTest {

    @Test(description = "Check isNegative method", dataProvider = "IsNegativeDataProvider")
    public void testCos(long a, boolean expected) {
        checkTime();
        boolean isNegative = calculator.isNegative(a);
        Assert.assertEquals(isNegative, expected, "Method 'isNegative' returned not expected value: ");
    }

    @DataProvider(name = "IsNegativeDataProvider")
    public Object[][] isNegativeDataProvider() {
        return new Object[][]{
                {88, false},
                {0, false},
                {-1, true}
        };
    }
}
