package io.learn.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    public void onStart(ITestContext arg) {
        System.out.println("Start the execution...." +arg.getName());
    }

    public void onTestStart(ITestResult arg) {
        System.out.println("Stated test...."+arg.getName());
    }

    public void onTestSkipped(ITestResult arg) {
        System.out.println("Skipped test...."+arg.getName());
    }

    public void onTestSuccess(ITestResult arg) {
        System.out.println("Test success....."+arg.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {
        //Auto generated
    }

    public void onFinish(ITestContext arg) {
        System.out.println("Finish the excution...."+arg.getName());
    }


}
