package com.epam.atm.module4.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.rules.TestName;

import java.util.Date;

public class BaseCalculatorTest {

    protected static final double DELTA = 1e-15;

    protected Calculator calculator = new Calculator();

    @Rule
    public TestName testName = new TestName();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Class started");
    }

    @Before
    public void beforeMethod() {
        System.out.println("Method started: " + testName.getMethodName());
    }

    @After
    public void afterMethod() {
        System.out.println("Method finished: " + testName.getMethodName());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Class finished");
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}

