package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListensTestNG extends CommonMethods implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test start: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successfully executeed: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has failed: " + result.getName());
		takeScreenShot(getDriver());
		if (hp.headerButton != null) {
			hp.headerButton.click();
			CommonMethods.clickOnMenuBar(hp.header, getProperty("Luma_HeaderOptionSelected"));
		}
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on Start started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on Finish Method");
	}

}
