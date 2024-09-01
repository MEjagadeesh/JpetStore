package com.App.Utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportgenerator 
{
	public static ExtentReports extent;
	   public static ExtentTest logger;
	    static int i = 1;
	    public void startReport()
	    {
	    	extent = new ExtentReports("C:\\Users\\Administrator\\Desktop\\Wipro  Java Programs\\CapstoneProject-4-JpetstoreDemo\\src\\test\\resources\\reports\\results.html",true);
	    }
	    public void startTest()
	    {
	    	logger = extent.startTest("test" + i);
	    	i++;
	    	logger.log(LogStatus.PASS, "Test is pass");
	    }
	    public void endTest()
	    {
	    	extent.endTest(logger);
	    }
	    public void endReport()
	    {
	    	extent.flush();
	    	extent.close();
	    }
}
