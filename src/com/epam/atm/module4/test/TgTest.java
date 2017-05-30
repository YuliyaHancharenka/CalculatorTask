package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseCalculatorTest {

    @Test(groups = "main", dataProvider = "TgDataProvider")
    public void testTg(double a, double expected) {
        checkTime();
        double tg = calculator.tg(a);
        Assert.assertEquals(tg, expected, "Expected to be equal: " + expected);
        System.out.println(a);
    }

    @DataProvider(name = "TgDataProvider")
    public Object[][] tgDataProvider() {
        System.out.println(Math.PI);
        return new Object[][]{
                {Math.PI / 4, 1},
                {Math.PI, 0}
        };
    }
}
