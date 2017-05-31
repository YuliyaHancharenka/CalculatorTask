package com.epam.atm.module4.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;

import java.lang.reflect.Method;
import java.util.Date;

public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
    //    System.out.println("Class started: " + getClass());
        System.out.println("Create instance of Calculator");
    }

    @Before
    public void beforeMethod(/*Method method*/) {
        //String testName = method.getName();
        System.out.println("Method started: "/* + testName*/);
    }

    @After
    public void afterMethod(/*Method method*/) {
       // String testName = method.getName();
        System.out.println("Method finished: "/* + testName*/);
    }

    @AfterClass
    public static void afterClass() {
   //     System.out.println("Class finished: " + getClass());
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}

