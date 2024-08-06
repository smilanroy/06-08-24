package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebXpath {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		// 
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("smilan.feddy@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("23244");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		//("//name[@data-testid='royal_email']"));
		
		
		
		
		

	}

}
