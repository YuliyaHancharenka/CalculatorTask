package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseCalculatorTest {

    @Test(description = "Check sqrt method", dataProvider = "SqrtDataProvider")
    public void testSqrt(double a, double expected) {
        double sqrt = calculator.sqrt(a);
        Assert.assertEquals(sqrt, expected, "Method 'sqrt' returned not expected value: ");
    }

    @DataProvider(name = "SqrtDataProvider")
    public Object[][] sqrtDataProvider() {
        return new Object[][]{
                {121, 11},
                {16, 4}
        };
    }
}
