package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebFrame3 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/frames");
	
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(2000);
	
	driver.switchTo().frame("frame1");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Range");
	
	Thread.sleep(2000);
	
	driver.switchTo().frame("frame3");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
	driver.switchTo().parentFrame();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).clear();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Range4");
	
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	
	driver.switchTo().frame("frame2");
	WebElement Animals = driver.findElement(By.xpath("//select[@id='animals']"));
	
	Select a=new Select(Animals);
	
	Thread.sleep(2000);
	
	a.selectByValue("big baby cat");
	
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	
	}

}
