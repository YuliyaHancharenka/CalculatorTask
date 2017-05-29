package com.epam.atm.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

import java.util.Date;

public class BaseCalculatorTest {

    Calculator calculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @BeforeGroups(value = {"main"})
    public void beforeGroup(){
        System.out.println("Before groups named 'main'");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("Create instance of Calculator ");
        calculator = new Calculator();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    protected void checkTime(){
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}

