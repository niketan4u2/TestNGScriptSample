package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {
	// This belongs to ITestListener and will execute before the whole Test starts

	public void onStart(ITestContext arg0) {
		Reporter.log("About to begin executing Class " + arg0.getName(), true);
	}

	// This belongs to ITestListener and will execute, once the whole Test is
	// finished

	public void onFinish(ITestContext arg0) {
		Reporter.log("About to end executing Class " + arg0.getName(), true);
	}
	// This belongs to ITestListener and will execute before each test method

	public void onTestStart(ITestResult arg0) {
		Reporter.log("Testcase " + arg0.getName() + " started successfully", true);
	}

	// This belongs to ITestListener and will execute only in the event of a
	// successful test method
	public void onTestSuccess(ITestResult arg0) {
		Reporter.log("Testcase " + arg0.getName() + " passed successfully", true);
	}

	// This belongs to ITestListener and will execute only in the event of a fail
	// test

	public void onTestFailure(ITestResult arg0) {
		Reporter.log("Testcase " + arg0.getName() + " failed", true);
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\91861\\Desktop\\Voicera-Analytics Learning Materaial\\TestNG_Framework\\TestNG_Simple_project\\screenshot\\Mon-Apr-11-20-09-46-IST-2022.png\">Test Result</a>");
	}

	// This belongs to ITestListener and will execute only in the event of the
	// skipped test methods

	public void onTestSkipped(ITestResult arg0) {
		Reporter.log("Testcase " + arg0.getName() + " got skipped", true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}
}
