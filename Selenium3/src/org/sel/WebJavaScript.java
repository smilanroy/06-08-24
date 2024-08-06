package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebJavaScript {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement username = driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].setAttribute('value','smilan')",username);
		
		// to getAttribute value
		
		Object executeScript = js.executeScript("returnarguments[0].getAttribute('value')",username);
		
		System.out.println(executeScript);
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		js.executeScript("arguments[0].setAttribute('value',r2134')",password);
		
		
		
		
		
		
	

	
		
		
	}

}
