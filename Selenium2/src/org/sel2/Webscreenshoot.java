package org.sel2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webscreenshoot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.fotmob.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File ssfile=ts.getScreenshotAs(OutputType.FILE);
		
		File file=new File("E:\\screenshot\\New folder\\screen\\run.jpeg");
		
		
		FileUtils.copyFile(ssfile, file);
		
		
		
	}

}
