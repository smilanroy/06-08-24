package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebApplication {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("smilan.feddy@gmail.com");
		
		WebElement tab=driver.findElement(By.id("pass"));
		tab.sendKeys("1234");
		
		driver.findElement(By.name("login")).click();
		
	
		driver.manage().window().maximize();
		driver.close();
		
		
		

		
		
		

			
		
		
		
		
		
				
		
		
		
		
	}
}
