package com.epam.atm.module4.testng;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivByZeroTest extends BaseCalculatorTest {

    @Test(description = "Check division by zero method", dataProvider = "DivByZeroDataProvider", expectedExceptions = NumberFormatException.class)
    public void testDivByZero(long a, long b) {
        long divByZero = calculator.div(a, b);
    }

    @DataProvider(name = "DivByZeroDataProvider")
    public Object[][] divByZeroDataProvider() {
        return new Object[][]{
                {5, 0},
                {6, 0}
        };
    }
}
