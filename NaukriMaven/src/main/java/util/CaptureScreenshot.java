package util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot extends BaseTest {
	public void capture(String snapshot) {
	
	BaseTest bs=new BaseTest();

	TakesScreenshot ts=(TakesScreenshot)driver;

	File fs=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(fs, new File("C:\\Users\\Administrator\\Documents\\Selenium Project\\Udemy\\Screenshot\\"+snapshot+".png"));}
		
		catch (Exception e) {
		// TODO Auto-generated catch block
		
		
		System.out.println("Exception arrived:"+e.getLocalizedMessage());}
	
	System.out.println("Screenshot captured");}}
