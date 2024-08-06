package com.aletss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScreen {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File Source=ts.getScreenshotAs(OutputType.FILE);// import
		
		File targetFile=new File("E:\\screenshot\\New folder\\screen\\run\\232.jpeg");
		
		FileUtils.copyFile(Source, targetFile);// Add throws
		
		
		
	}
	


}
