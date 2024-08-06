package org.sel2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactinfrcu {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("smilanroy28");
		driver.findElement(By.id("password")).sendKeys("roy12345");
	
	   driver.findElement(By.id("login")).click();
	

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));

		Select l = new Select(location);

		l.selectByValue("Melbourne");

		Thread.sleep(2000);

		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));

		Select h = new Select(hotels);
		h.selectByVisibleText("Hotel Sunshine");
		
		
		WebElement rooms = driver.findElement(By.xpath("//select[@name='room_type']"));
		
		Select r = new Select(rooms);
		r.selectByIndex(3);  //superDeleux
		
		Thread.sleep(2000);
		
		WebElement Nosroom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select n = new Select(Nosroom);
		
		n.selectByValue("2");
		
		Thread.sleep(2000);
		WebElement datein = driver.findElement(By.xpath("(//input[@type='text'])[2]"));datein. clear();datein.sendKeys("25/02/2025");
		
		Thread.sleep(2000);
		
		WebElement dateout = driver.findElement(By.xpath("//input[@name='datepick_out']"));dateout.clear();dateout.sendKeys("26/02/2025");
		Thread.sleep(2000);
		
		WebElement adultper = driver.findElement(By.xpath("//select[@name='adult_room']"));
		
		Select ad = new Select(adultper);
		ad.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement childr = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select cr = new Select(childr);
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
		
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("A3,Prestige apts,mugalivakkam,chennai");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("2798088080233223");
		Thread.sleep(2000);
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select ct = new Select(cardtype);
		ct.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement Smonth= driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select Sm = new Select(Smonth);
		Sm.selectByValue("3");
		Thread.sleep(2000);
		
		WebElement Syear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select Sy = new Select(Syear);
		Sy.selectByIndex(17); //2027
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("3455");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement element = driver.findElement(By.name("order_no"));
		String attribute = element.getAttribute("value");
		System.out.println(attribute);

		
	}

}




