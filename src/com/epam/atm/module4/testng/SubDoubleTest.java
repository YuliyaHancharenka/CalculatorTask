package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseCalculatorTest {

    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "SubDoubleDataProvider")
    public SubDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(description = "Check double subtraction method")
    public void testDoubleSub() {
        double sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected, DELTA, "Method 'testDoubleSub' returned not expected value: ");
    }


    @DataProvider(name = "SubDoubleDataProvider")
    public static Object[][] subDoubleDataProvider() {
        return new Object[][]{
                {1, 1.1, -0.1},
                {-5.1, 2.1, -7.2},
                {-5, -2, -3}
        };
    }
}
