package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webclick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		Actions actions=new Actions(driver);
		
		WebElement allcat = driver.findElement(By.xpath("//option[text()='All Categories']"));
		actions.moveToElement(allcat).perform();
		
		Thread.sleep(3000);
		
		actions.contextClick(allcat).perform();
		

	
	}
}
