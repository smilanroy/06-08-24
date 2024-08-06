package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webselect {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement states = driver.findElement(By.xpath("//select[@name='States']"));
		
		Select s=new Select(states);
		s.selectByValue("Florida");
		
	
		

	}

}
