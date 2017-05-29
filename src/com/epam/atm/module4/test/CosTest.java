package com.epam.atm.module4.test;


import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculatorTest {
    @Test(groups = "main")
    @Parameters({"a", "expected"})
    public void testCos(double a, double expected) {
        double cos = calculator.cos(a);
        Assert.assertEquals(cos, expected);
    }
}
