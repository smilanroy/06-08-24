package org.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebWindowHandlesTask {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("puma football shoes",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class='s-image'])[2]")).click();
		
		
		//to get parent window and console
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Thread.sleep(2000);
		//to get allwindow
		
		Set<String> Allwindow = driver.getWindowHandles();
		System.out.println(Allwindow);
		Thread.sleep(2000);
		
		// to swift and work on childclass
		
		for(String Bs:Allwindow) {
			if(!parentwindow.equals(Bs)) {
			driver.switchTo().window(Bs);
			System.out.println(Bs);
			}
		}
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			
			
			Thread.sleep(3000);
			
			driver.switchTo().window(parentwindow);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).clear();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("arsenal football jersey",Keys.ENTER);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
			
			Thread.sleep(2000);
			
			//parentwindow
			//String jer1 = driver.getWindowHandle();
			//System.out.println(jer1);
			
			Thread.sleep(2000);
			
			
			//all window
			
			Set<String> jer2= driver.getWindowHandles();
			System.out.println(jer2);
			
			Thread.sleep(2000);
			
			// to enter second window
			
			for(String jer:jer2) {   // for(datatype newvariable:oldvariable)
				if(!parentwindow.equals(jer)) {
				driver.switchTo().window(jer);
				System.out.println(jer);
				
				}
			}
			
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
			driver.switchTo().window(parentwindow);
			
			Thread.sleep(2000);
			
			
			
			
		}
		
		
		

	}

