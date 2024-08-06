package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

	
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("smilan.feddy@gmail.com");
		

		
		
		

	}

}
