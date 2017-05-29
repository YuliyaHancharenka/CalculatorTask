package com.epam.atm.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
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

    @Test
    @Parameters({"a", "b", "expected"})
    public void testSub() {
        double sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }


    @DataProvider(name = "SubDoubleDataProvider")
    public static Object[][] subDoubleDataProvider() {
        return new Object[][]{
                {1.5, 1.4, 0.1},
                {0.7, 0.4, 0.3}
        };
    }
}
