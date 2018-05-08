package com.appium.webtest;

import org.testng.*;


public final class AppiumParallelMethodTestListener1
        implements ITestListener, IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        //System.out.println("in before invocation method 11111" + method.getTestMethod().getMethodName());

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

        //System.out.println("in after invocation method 22222" + method.getTestMethod().getMethodName());
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(Thread.currentThread().getId());
        System.out.println("in test start method 33333" + iTestResult.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // System.out.println("in test success method 44444" + result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }


    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        //System.out.println("in on start method 55555" + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
    }

}
