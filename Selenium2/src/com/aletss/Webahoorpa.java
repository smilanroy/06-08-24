package com.aletss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Webahoorpa {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fotmob.com/");
		
		System.out.println(driver.getTitle());
		
		Shutterbug.shootPage(driver, Capture.FULL, true).save("E:\\screenshot\\New folder\\screen\\run.jpeg");
		
				
	

	}

}
