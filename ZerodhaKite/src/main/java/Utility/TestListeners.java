package Utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import POJO.BaseTest;

public class TestListeners extends BaseTest implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		try {
			ScreenShotP.getScreenShot(obj, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	public void onTestFail(ITestResult result)  {
		
	System.out.println(result.getName()+"Test Failed");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test Success");
	}
	public void OnSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test Skipped");
	}
	
	

	
	
	
	
	
}
