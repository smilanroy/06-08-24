package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions actions=new Actions(driver);
		
		driver.manage().window().maximize();
		
		WebElement smart = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		Thread.sleep(3000);
		
		WebElement target = driver.findElement(By.className("placeholder"));
		Thread.sleep(3000);
		
		actions.dragAndDrop(smart, target).perform();
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		Thread.sleep(3000);
		WebElement target2 = driver.findElement(By.className("placeholder"));
		Thread.sleep(3000);
		actions.dragAndDrop(source, target2).perform();
		Thread.sleep(3000);
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		Thread.sleep(3000);
		WebElement target3 = driver.findElement(By.className("placeholder"));
		Thread.sleep(3000);
		actions.dragAndDrop(source1, target3).perform();
		Thread.sleep(3000);
		WebElement source2 = driver.findElement(By.xpath("//a[text()='-5000 ']"));
		Thread.sleep(3000);
		WebElement target4 = driver.findElement(By.className("placeholder"));
		Thread.sleep(3000);
		actions.dragAndDrop(source2, target4).perform();
		Thread.sleep(3000);
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		Thread.sleep(3000);
		WebElement target5 = driver.findElement(By.className("placeholder"));
		Thread.sleep(3000);
		actions.dragAndDrop(source3, target5).perform();
		Thread.sleep(3000);
		
		
		
		actions.dragAndDrop(source2, target4).perform();
		
	
		
		
		
		
	}

}
