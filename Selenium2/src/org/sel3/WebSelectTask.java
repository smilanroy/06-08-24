package org.sel3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebSelectTask {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		WebElement day= driver.findElement(By.xpath("//select[@class='form-control']"));
		Thread.sleep(2000);
		
		Select s=new Select(day);
		
		s.selectByValue("Wednesday");
		Thread.sleep(2000);
		
		WebElement code = driver.findElement(By.xpath("//select[@name='States']"));
		
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='First Selected']")).click();
		
		Select c=new Select(code);
		
		
		//is multiple
		boolean multiple = c.isMultiple();
		System.out.println(multiple);
		
		//to based on value
		
		c.selectByValue("New Jersey");
		
		//to based on visibletext
		c.selectByVisibleText("Texas");
		
		//to based on index
		
		c.selectByIndex(1);
		
		
		// to print first selected option
		
		WebElement firstselect = c.getFirstSelectedOption();
		String text = firstselect.getText();
		System.out.println(text);
		
		
		Thread.sleep(2000);
		
		
		 List<WebElement> allSelect= c.getAllSelectedOptions();
		 for(int i=0;i<allSelect.size();i++) {
			 WebElement element = allSelect.get(i);
			 String text2 = element.getText();
			 System.out.println(text2);
		 }
				 
		
		 }	
		
}
	

