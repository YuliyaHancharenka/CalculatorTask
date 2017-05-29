package com.epam.atm.module4.test;


import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivByZeroTest extends BaseCalculatorTest {
    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        long sub = calculator.sub(1, 0);
    }
}
