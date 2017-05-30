package com.epam.atm.module4.test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivByZeroTest extends BaseCalculatorTest {

    @Parameters({"a", "b"})
    @Test(dataProvider = "DivByZeroDataProvider", expectedExceptions = NumberFormatException.class)
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
