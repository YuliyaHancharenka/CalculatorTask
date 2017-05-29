package com.epam.atm.module4.test;


import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseCalculatorTest {
    @Test(dataProvider = "MultDoubleDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testMult(double a, double b, double expected) {
        double mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected);
    }


    @DataProvider(name = "MultDoubleDataProvider")
    public Object[][] multDoubleDataProvider() {
        return new Object[][]{
                {10, 2, 20},
                {8, 1, 8}
        };
    }
}
