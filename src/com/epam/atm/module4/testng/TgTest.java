package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseCalculatorTest {

    @Test(description = "Check tg method", groups = "main", dataProvider = "TgDataProvider")
    public void testTg(double a, double expected) {
        checkTime();
        double tg = calculator.tg(a);
        Assert.assertEquals(tg, expected, "Method 'tg' returned not expected value: ");
        System.out.println(a);
    }

    @DataProvider(name = "TgDataProvider")
    public Object[][] tgDataProvider() {
        System.out.println(Math.PI);
        return new Object[][]{
                {Math.PI / 4, 1},
                {-Math.PI / 3, -Math.sqrt(3)},
                {Math.PI, 0}
        };
    }
}
