package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest extends BaseCalculatorTest {
    @Test(dataProvider = "CtgDataProvider")
    @Parameters({"a", "expected"})
    public void testCtg(double a, double expected) {
        double ctg = calculator.ctg(a);
        Assert.assertEquals(ctg, expected);
    }


    @DataProvider(name = "CtgDataProvider")
    public Object[][] ctgDataProvider() {
        return new Object[][]{
                {Math.PI/4, 1},
                {Math.PI/2, 0}
        };
    }
}
