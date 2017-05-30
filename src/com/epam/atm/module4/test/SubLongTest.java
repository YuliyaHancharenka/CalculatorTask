package com.epam.atm.module4.test;


import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
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

    @Test(timeOut = 1000)
    @Parameters({"a", "b", "expected"})
    public void testLongSub() {
        Timeout.sleep(2);
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }


    @DataProvider(name = "SubLongDataProvider")
    public static Object[][] subLongDataProvider() {
        return new Object[][]{
                {1, 1, 0},
                {0, 0, 0}
        };
    }
}

