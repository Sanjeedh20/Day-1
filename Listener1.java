package com.selenium.demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test started guys....");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed guys....");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Sorry, Test failed guys....");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
