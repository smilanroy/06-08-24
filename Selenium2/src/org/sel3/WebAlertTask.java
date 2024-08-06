package org.sel3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebAlertTask {

	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	System.out.println(driver.getTitle());
	
	//Alerts and Actions
	
	driver.manage().window().maximize();
	
	//Simple Alert okbutton
	driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
	Actions actions=new Actions(driver);
	Alert simplealert = driver.switchTo().alert();
	Thread.sleep(2000);
	simplealert.accept();
	
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	Thread.sleep(2000);
	Alert salert = driver.switchTo().alert();
	salert.accept();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	Alert dalert = driver.switchTo().alert();
	Thread.sleep(2000);
	dalert.dismiss();
	
	driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	Thread.sleep(2000);
	Alert confalert = driver.switchTo().alert();
	Thread.sleep(2000);
	confalert.sendKeys("great");
	Thread.sleep(2000);
	confalert.accept();
	
	WebElement subover= driver.findElement(By.xpath("//button[@class='dropbtn']"));
	actions.moveToElement(subover).perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@id='link2']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	WebElement dclick = driver.findElement(By.xpath("(//input[@type='button'])[5]"));
	actions.doubleClick(dclick).perform();
	Thread.sleep(2000);
	dclick.click();
	
	
	
}
}
