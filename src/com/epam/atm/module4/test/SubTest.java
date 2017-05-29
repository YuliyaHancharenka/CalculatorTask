package com.epam.atm.module4.test;


import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubTest {
    @Test(suiteName = "Calculator")
    @Parameters({"a", "b", "expected"})
    public void testSub(long a, long b, long expected) {
        Calculator calculator = new Calculator();
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }


    @DataProvider(name = "SubDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {1, 1, 0},
                {0, 0, 0}
        };
    }
}

