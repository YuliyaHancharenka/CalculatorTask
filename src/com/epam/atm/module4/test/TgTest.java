package com.epam.atm.module4.test;


import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TgTest extends BaseCalculatorTest {
    @Test(groups = "main")
    @Parameters({"a", "expected"})
    public void testTg(double a, double expected) {
        double tg = calculator.tg(a);
        Assert.assertEquals(tg, expected);
    }
}
