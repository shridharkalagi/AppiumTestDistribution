package com.appium.webtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDemo {

//    @Test(dataProvider = "dataMethod")
//    void testMethod1(String count) {
//        System.out.println("in testmethod1() " + count + "  " + Thread.currentThread().getId());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test(dataProvider = "dataMethod")
//    void testMethod2(String count) {
//        System.out.println("in test method 2 " + count + "   " + Thread.currentThread().getId());
//    }
//
//    @Test()
//    void testMethod3() {
//        System.out.println("in test method 3 " + "   " + Thread.currentThread().getId());
//    }
//
    @DataProvider(parallel = true)
    public Object[][] dataMethod() {
        return new Object[][]{{"first"}, {"second"}, {"third"}, {"four"}, {"five"}, {"six"}, {"seven"}, {"eight"}, {"nine"}, {"ten"}};
    }
//


//    @BeforeMethod
//    public void beforeMethod() {
//        long id = Thread.currentThread().getId();
//        System.out.println("Before test-method. Thread id is: " + id);
//    }

    @Test(dataProvider = "dataMethod")
    public void testMethodsOne(String count) {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id +"and with count " +count);
    }

    @Test
    public void testMethodsThree() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method three. Thread id is: " + id);
    }

    @Test
    public void testMethodsFour() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method four. Thread id is: " + id);
    }


    @Test
    public void testMethodsFive() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method five. Thread id is: " + id);
    }
    @Test
    public void testMethodsTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id);
    }

//
//    @AfterMethod
//    public void afterMethod() {
//        long id = Thread.currentThread().getId();
//        System.out.println("After test-method. Thread id is: " + id);
//    }
}