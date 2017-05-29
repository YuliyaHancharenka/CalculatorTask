package com.epam.atm.module4.test;


import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultLongTest extends BaseCalculatorTest {
    @Test(dataProvider = "MultLongDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testMult(long a, long b, long expected) {
        long mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected);
    }


    @DataProvider(name = "MultLongDataProvider")
    public Object[][] multLongDataProvider() {
        return new Object[][]{
                {10, 2, 20},
                {8, 1, 8}
        };
    }
}
