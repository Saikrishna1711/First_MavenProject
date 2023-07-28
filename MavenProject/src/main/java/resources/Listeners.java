package resources;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.ExtentManager;
import okhttp3.internal.cache.DiskLruCache.Snapshot;

public class Listeners extends Base.Basepage implements ITestListener  {

	public Listeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public synchronized void onTestFailure(ITestResult result) {
		ExtentManager.getTest().fail(result.getThrowable());
		
		try {
			System.out.println("Test failed"+ result.getName());
			TakeSnapShot(result.getMethod().getMethodName());
			ExtentManager.attachImage();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
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
	public synchronized void onStart(ITestContext context) {
		ExtentManager.getReport();
		ExtentManager.createTest(context.getName(), context.getName());
		
		
		
	}
	@Override
	public synchronized void onFinish(ITestContext context) {
		ExtentManager.flushReport();
		
		
	}

}
