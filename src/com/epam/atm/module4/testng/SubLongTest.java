package com.epam.atm.module4.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubLongTest extends BaseCalculatorTest {

    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "SubLongDataProvider")
    public SubLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(description = "Check long subtraction method")
    public void testLongSub() {
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected, "Method 'testLongSub' returned not expected value: ");
    }


    @DataProvider(name = "SubLongDataProvider")
    public static Object[][] subLongDataProvider() {
        return new Object[][]{
                {1, 1, 0},
                {-5, 2, -7},
                {-5, -2, -3}
        };
    }
}

