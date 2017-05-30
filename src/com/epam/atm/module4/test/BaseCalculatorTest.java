package com.epam.atm.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;
import java.lang.reflect.Method;
import java.util.Date;

public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Suite 'Calculator' started");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Class started: " + getClass());
        System.out.println("Create instance of Calculator");
        calculator = new Calculator();
    }

    @BeforeGroups(value = {"main"})
    public void beforeGroup() {
        System.out.println("Groups named 'main' started");
    }

    @BeforeMethod()
    public void beforeMethod(Method method) {
        String testName = method.getName();
        System.out.println("Method started: " +  testName);
    }

    @AfterMethod
    public void afterMethod(Method method) {
        String testName = method.getName();
        System.out.println("Method finished: " +  testName);
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Class finished: " + getClass());
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Suite 'Calculator' finished");
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}

