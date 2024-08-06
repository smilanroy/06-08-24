package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;

public class WebActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions actions=new Actions(driver);
		
		//To Click using action class
		actions.click(search).perform();
		// To double click
		
		Thread.sleep(3000);
		
		actions.doubleClick(search).perform();
		
		// To Right click
		
		Thread.sleep(3000);
		actions.contextClick(search).perform();
		Thread.sleep(3000);
		actions.click(search).perform();
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		actions.moveToElement(prime).perform();
		
		Thread.sleep(4000);
		
		WebElement allcat = driver.findElement(By.xpath("//option[text()='All Categories']"));
		actions.moveToElement(allcat).perform();
		

	
		
		
			
		
		
		
		
		
		
	
	}

}
