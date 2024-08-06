package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFrameTask {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		
		
		WebElement nested = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(nested);
		
		WebElement nestedele = driver.findElement(By.xpath("//div[@class='iframe-container']"));// use .gettext for taking text
		
		
		Thread.sleep(2000);
		
		WebElement frame2 = driver.findElement(By.xpath("//div[@class='iframe-container']"));
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("roy");
		
		
		
			
			
		}
		
		
		
		
		
	
		
	
	}

