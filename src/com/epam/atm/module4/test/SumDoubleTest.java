package com.epam.atm.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SumDoubleTest extends BaseCalculatorTest {

    @Test(groups = "main")
    @Parameters({"a", "b", "expected"})
    public void testSum(double a, double b, double expected) {
       // Calculator calculator = new Calculator();
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }
}
