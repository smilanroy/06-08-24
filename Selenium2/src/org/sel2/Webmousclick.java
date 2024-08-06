package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webmousclick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		
		driver.findElement(By.xpath("//input[@value='File Upload']")).click();
		
		Thread.sleep(3000);
		
		
		//WebElement filed = driver.findElement(By.xpath("//input[@type='file']")).click();
		
		
		//Thread.sleep(2000);
		//String filepath=("Desktop/roy.docx");
		//Thread.sleep(2000);
		
		//filed.sendKeys("Desktop/roy.docx");
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

	private static Actions Actions(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
