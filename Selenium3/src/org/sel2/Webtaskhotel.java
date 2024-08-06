package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webtaskhotel {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("smilanroy24");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("roy1234");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys("roy1234");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("smilanroy");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys("smilan.feddy@gmail.com");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("smilanroy24");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("roy1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(2000);
		
		
		
		WebElement location= driver.findElement(By.xpath("select[@name='location']"));
		
		Select L = new Select(location);
		
		
		//select by index
		L.selectByIndex(1); //melbourne
		
		Thread.sleep(2000);
		WebElement hotels= driver.findElement(By.xpath("//select[@name='hotels']"));
		
		Select H = new Select(hotels);
		
		//select by value
		H.selectByValue("Hotel Sunshine");
		
		Thread.sleep(2000);


		WebElement rooms = driver.findElement(By.xpath("//select[@name='room_type']"));
		
		Select R=new Select(rooms);
		
		//select by visibletext
		
		R.selectByVisibleText("Super Deluxe");
		
		Thread.sleep(2000);
		
		WebElement rnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		
		Select r1=new Select(rnos);
		
		r1.selectByVisibleText("Seven");
		
		

		
		
		
		
		
			
		
		
	}
}
