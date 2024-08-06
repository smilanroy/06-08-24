

package org.sel2;

import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class WebHandlestaks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 15 pro max",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		
		Thread.sleep(2000);
		
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Thread.sleep(2000);
		
		Set<String> Allwindow = driver.getWindowHandles();
		System.out.println(Allwindow);
		
		Thread.sleep(2000);
		
		//do in list
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addAll(Allwindow);
		
		String childwindow = linkedList.get(1);
		driver.switchTo().window(childwindow);
		


		
		
		
	}
}
