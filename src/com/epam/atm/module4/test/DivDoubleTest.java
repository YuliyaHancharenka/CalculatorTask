package com.epam.atm.module4.test;


import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseCalculatorTest {
    @Test
    @Parameters({"a", "b", "expected"})
    public void testDiv(double a, double b, double expected) {
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }
}
