package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest extends BaseCalculatorTest {
    @Test(dataProvider = "SqrtDataProvider")
    @Parameters({"a", "expected"})
    public void testSqrt(double a, double expected) {
        double sqrt = calculator.sqrt(a);
        Assert.assertEquals(sqrt, expected);
    }


    @DataProvider(name = "SqrtDataProvider")
    public Object[][] sqrtDataProvider() {
        return new Object[][]{
                {121, 11},
                {16, 4}
        };
    }
}
