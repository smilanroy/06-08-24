package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webtaskhotel {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("smilanroy24");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("roy1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		
		Select l = new Select(location);
		l.selectByValue("Sydney");
		Thread.sleep(2000);
		
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select h = new Select(hotels);
		h.selectByValue("Hotel Hervey");
		Thread.sleep(2000);
		
		WebElement htype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select ht = new Select(htype);
		ht.selectByVisibleText("Deluxe");
		Thread.sleep(2000);
		
		WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select rn = new Select(roomnos);
		rn.selectByValue("4");
		Thread.sleep(2000);
		
		WebElement datein = driver.findElement(By.xpath("//input[@name='datepick_in']"));datein.clear();datein.sendKeys("20/02/2025");
		Thread.sleep(2000);
		
		
		WebElement dateout = driver.findElement(By.xpath("//input[@name='datepick_out']"));dateout.clear();dateout.sendKeys("27/02/2025");
		Thread.sleep(2000);
		
		WebElement roomper= driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select rp = new Select(roomper);
		rp.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select cr = new Select(childroom);
		cr.selectByValue("2");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("smilan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("roy");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Prestige villa , chennai");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");
		Thread.sleep(2000);
		
		WebElement card = driver.findElement(By.id("cc_type"));
		Select cd = new Select(card);
		cd.selectByValue("VISA");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select m = new Select(month);
		m.selectByVisibleText("February");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select y = new Select(year);
		y.selectByValue("2029");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Thread.sleep(2000);
		
		
		
		
		driver.close();	
		
	
		
		
	}
}
