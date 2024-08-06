package com.aletss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[contains(text(),' the button to display')][1]")).click();

		//confirm alert
		
		Alert simplealert = driver.switchTo().alert();
		Thread.sleep(3000);
		simplealert.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'display a confirm')]")).click();
		Alert confalert = driver.switchTo().alert();
		confalert.dismiss();
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate the prompt')]")).click();
		
		Alert alerts = driver.switchTo().alert();
		alerts.sendKeys("smilan");
		Thread.sleep(3000);
		alerts.accept();
		
		
		
		
		
		
		
		
		
		
		
		;

	}

}
