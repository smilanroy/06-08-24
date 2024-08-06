package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFrame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		//to maximize
		
		driver.manage().window().maximize();
		
		// get title
		
		System.out.println(driver.getTitle());
		
		driver.findElements(By.tagName(null));
		
		
		
		
	

	}

}
