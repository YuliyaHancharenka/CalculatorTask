package com.epam.atm.module4.test;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseCalculatorTest {
    @Test(dependsOnGroups = "main")
    @Parameters({"a", "b", "expected"})
    public void testDoubleDiv(double a, double b, double expected) {
        checkTime();
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }
}
