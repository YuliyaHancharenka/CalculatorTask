package com.epam.atm.module4.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.Date;

public class BaseCalculatorTest {

    protected static final double DELTA = 1e-15;

    protected Calculator calculator;

    @BeforeSuite(description = "Before suite preparations")
    public void beforeSuite() {
        System.out.println("Suite 'Calculator' started");
    }

    @BeforeClass(description = "Before class preparations")
    public void beforeClass() {
        System.out.println("Class started: " + getClass());
        System.out.println("Create instance of Calculator");
        calculator = new Calculator();
    }

    @BeforeGroups(description = "Before groups preparations", value = {"main"})
    public void beforeGroup() {
        System.out.println("Groups named 'main' started");
    }

    @BeforeMethod(description = "Before method preparations")
    public void beforeMethod(Method method) {
        String testName = method.getName();
        System.out.println("Method started: " + testName);
    }

    @AfterMethod(description = "After method preparations")
    public void afterMethod(Method method) {
        String testName = method.getName();
        System.out.println("Method finished: " + testName);
    }

    @AfterClass(description = "After class preparations")
    public void afterClass() {
        System.out.println("Class finished: " + getClass());
    }

    @AfterSuite(description = "After suite preparations")
    public void afterSuite() {
        System.out.println("Suite 'Calculator' finished");
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}

