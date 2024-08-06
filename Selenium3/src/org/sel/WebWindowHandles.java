package org.sel;

import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebWindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 15 pro max",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		
		
		//to find parentwindow
		
		String parentwindow= driver.getWindowHandle();
		System.out.println(parentwindow);
		
		
		Thread.sleep(2000);
		
		//to find all windows
		
		Set<String> Allwindow = driver.getWindowHandles();
		System.out.println(Allwindow);
		
		Thread.sleep(2000);
		
		//to find childclass
		
		for(String xi:Allwindow) {
			if(!parentwindow.equals(xi));
			driver.switchTo().window(xi);
			System.out.println("first window id:"+xi);
		
			Thread.sleep(2000);
		}	
			//or do in list
			
			LinkedList<String> linkedList = new LinkedList<String>(); //newLinked list <string>
			linkedList.addAll(Allwindow);
			
			String childwindow = linkedList.get(1);
			driver.switchTo().window(childwindow);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
		
		
		
	}

}
