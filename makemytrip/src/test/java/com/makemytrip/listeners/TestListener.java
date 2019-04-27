package com.makemytrip.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.makemytrip.tests.BaseTest;

public class TestListener extends BaseTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("========================================================================");
		logger.info("<----"+result.getName()+ "  is Started---->");
		System.out.println("========================================================================");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("========================================================================");
		logger.info("<----"+result.getName()+ "  was Passed---->");
		System.out.println("========================================================================");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("========================================================================");
		logger.error("<----"+result.getName()+ "  was Failed---->");
		System.out.println("========================================================================");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("========================================================================");
		logger.warn("<----"+result.getName()+ "  was Skipped---->");
		System.out.println("========================================================================");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		
	}

	

}
