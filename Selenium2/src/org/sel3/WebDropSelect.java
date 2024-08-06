package org.sel3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDropSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Smilan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("roy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8778136268");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("roy123");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(date);
		
		Thread.sleep(2000);
		
		s.selectByValue("4");
		
		//month
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select m=new Select(month);
		Thread.sleep(2000);
		
		m.selectByVisibleText("Apr");
		
		
		//select year
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select y=new Select(year);
		
		Thread.sleep(2000);
		y.selectByIndex(4);
		
		Thread.sleep(4000);
		// Select all options
		
		List<WebElement> list = s.getOptions();
		
		//Using for loop
		
		System.out.println("For loop");
		
		for(int i=0;i<list.size();i++) {
			WebElement faceyear= list.get(i);
			String text = faceyear.getText();
			System.out.println(text);
			
		}
		
		//foreach loop
		
			List<WebElement> options = m.getOptions();//
			for(WebElement newvar:options) {
				String text = newvar.getText();
				System.out.println(text);
			}
			
			
			Thread.sleep(4000);
			
			driver.close();
			
					
		}
		
	}
