package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgTest extends BaseCalculatorTest {

    @Test(description = "Check ctg method", dataProvider = "CtgDataProvider")
    public void testCtg(double a, double expected) {
        double ctg = calculator.ctg(a);
        Assert.assertEquals(ctg, expected, "Expected to be equal: " + expected);
    }

    @DataProvider(name = "CtgDataProvider")
    public Object[][] ctgDataProvider() {
        return new Object[][]{
                {Math.PI / 4, 1},
                {Math.PI / 2, 0}
        };
    }
}
